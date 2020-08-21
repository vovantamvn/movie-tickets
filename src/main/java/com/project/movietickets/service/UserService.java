package com.project.movietickets.service;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

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
        var passwordEncode = passwordEncoder.encode(user.getPassword());
        user.setPassword(passwordEncode);

        return userRepository.save(user);
    }
}
