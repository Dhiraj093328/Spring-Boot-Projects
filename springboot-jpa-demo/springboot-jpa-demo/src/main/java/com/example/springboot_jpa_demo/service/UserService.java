package com.example.springboot_jpa_demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot_jpa_demo.entity.User;
import com.example.springboot_jpa_demo.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}