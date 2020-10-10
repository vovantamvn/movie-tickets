package com.project.movietickets.service;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.model.Role;
import com.project.movietickets.model.UserModel;
import com.project.movietickets.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public UserModel findUserById(int id) {
        var user = userRepository.getOne(id);
        var model = new UserModel(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getEmail(),
                user.getFullName(),
                user.isGender(),
                user.getDateOfBirth(),
                user.getRole()
        );

        return model;
    }

    public UserEntity updateUser(int id, UserModel model) {

        System.out.println(model);

        var user = userRepository.getOne(id);
        var password = model.getPassword();

        if (!password.isBlank()){
            String newPassword = passwordEncoder.encode(model.getPassword());
            user.setPassword(newPassword);
        }

        user.setFullName(model.getFullName());
        user.setUsername(model.getUsername());
        user.setDateOfBirth(model.getDateOfBirth());
        user.setEmail(model.getEmail());
        user.setGender(model.isGender());

        return userRepository.save(user);
    }

    public Optional<UserEntity> findUserByUsername(String username) {
        return userRepository.findUserEntityByUsername(username);
    }
}
