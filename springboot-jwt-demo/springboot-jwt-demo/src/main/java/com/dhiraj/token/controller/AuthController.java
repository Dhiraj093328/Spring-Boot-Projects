package com.dhiraj.token.controller;

import com.dhiraj.token.entity.User;
import com.dhiraj.token.repository.UserRepository;
import com.dhiraj.token.security.JwtUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository repo;
    private final JwtUtil jwtUtil;
    private final BCryptPasswordEncoder encoder;

    public AuthController(UserRepository repo, JwtUtil jwtUtil, BCryptPasswordEncoder encoder) {
        this.repo = repo;
        this.jwtUtil = jwtUtil;
        this.encoder = encoder;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User dbUser = repo.findByUsername(user.getUsername())
                .orElse(null);

        if (dbUser == null) {
            return "User not found";
        }

        if (encoder.matches(user.getPassword(), dbUser.getPassword())) {
            return "Login successful";
        }

        return "Invalid password";
    }
}