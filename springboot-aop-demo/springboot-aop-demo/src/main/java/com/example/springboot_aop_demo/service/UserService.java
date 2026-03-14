package com.example.springboot_aop_demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public String getUserInfo()
	{
		System.out.println("Inside Userinfo method");
		return "User Details";
	}

}
