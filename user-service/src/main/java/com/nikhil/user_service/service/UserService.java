package com.nikhil.user_service.service;

import com.nikhil.user_service.model.User;
import com.nikhil.user_service.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    public UserRepository userRepository;

    public User registerUser(User user) {
        return this.userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public User getUserByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }
}
