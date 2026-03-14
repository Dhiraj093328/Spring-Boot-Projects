package com.example.springboot_aop_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_aop_demo.service.UserService;

@RestController
public class UserController {
	
	private final UserService userservice;
	
	public UserController(UserService userservice)
	{
		this.userservice=userservice;
	}
	
	@GetMapping("/userinfo")
	public String getUser()
	{
		return userservice.getUserInfo();
	}

}
