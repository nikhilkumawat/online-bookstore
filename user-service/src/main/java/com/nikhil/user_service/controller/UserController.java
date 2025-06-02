package com.nikhil.user_service.controller;

import com.nikhil.user_service.model.User;
import com.nikhil.user_service.repository.UserRepository;
import com.nikhil.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userRepository.findByUsername(username);
    }
}
