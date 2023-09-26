package com.anz.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.demo.entity.Users;
import com.anz.demo.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/")
	public List<Users> getUsers() {
		return userRepo.findAll();
	}

}
