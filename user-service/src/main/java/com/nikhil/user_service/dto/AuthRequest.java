package com.nikhil.user_service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class AuthRequest {
    private String username;
    private String password;

    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}