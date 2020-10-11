package com.project.movietickets.controller.web.admin;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.model.UserModel;
import com.project.movietickets.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/admin/employees")
    public String index(Model model) {
        var employees = userService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "admin/employee/index";
    }

    @GetMapping("/admin/employees/{id}/delete")
    public String delete(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/admin/employees";
    }

    @GetMapping("/admin/employees/create")
    public String create(Model model) {
        model.addAttribute("user", new UserEntity());
        return "admin/employee/create";
    }

    @PostMapping("/admin/employees/create")
    public String store(@ModelAttribute("user") UserEntity user, Model model) {
        var result = userService.createUser(user);

        if (result == null) {
            model.addAttribute("message", "Username hoặc Email đã trùng");
            return "admin/employee/create";
        }

        return "redirect:/admin/employees";
    }

    /**
     * Update user
     */
    @GetMapping("/admin/employees/{id}/update")
    public String update(@PathVariable("id") int id, Model model){
        UserModel user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "admin/employee/update";
    }

    @PostMapping("/admin/employees/{id}/update")
    public String updateUser(@PathVariable("id") int id, @ModelAttribute("user") UserModel user){
        userService.updateUser(id, user);
        return "redirect:/admin/employees";
    }
}
