package com.project.movietickets.service;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.model.Role;
import com.project.movietickets.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public boolean isAdmin(String name) {
        var user = userRepository.findUserEntityByUsername(name).get();

        return user.getRole().equals("ROLE_ADMIN");
    }

    public boolean deleteUser(int id){
        userRepository.deleteById(id);

        return userRepository.findById(id).isEmpty();
    }

    public UserEntity createUser(UserEntity user){
        if (user.getPassword().isBlank() || user.getUsername().isBlank()){
            return null;
        }

        var passwordEncode = passwordEncoder.encode(user.getPassword());
        user.setPassword(passwordEncode);
        user.setRole(Role.ROLE_EMPLOYEE);

        try{
            return userRepository.save(user);
        } catch (Exception e){
            log.error(e.getMessage());
        }

        return null;
    }

    public List<UserEntity> getAllEmployees() {
        return userRepository.findAllByRoleEquals(Role.ROLE_EMPLOYEE);
    }

    public String getRole(String username) {
        var user = userRepository.findUserEntityByUsername(username).get();
        var role = user.getRole().name();
        return role;
    }
}
