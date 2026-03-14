package com.example.springboot_jpa_demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.example.springboot_jpa_demo.entity.*;

public interface UserRepository extends  JpaRepository<User, Integer> {
	
	
}
