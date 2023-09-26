package com.anz.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.demo.entity.Users;
import com.anz.demo.repository.UserRepository;
import com.anz.demo.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	UserServiceImpl userService;

	@GetMapping("/")
	public List<Users> getUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public Users getUserById(@PathVariable("id") int userId) {
		return userService.getUserById(userId);
	}

	@PostMapping("/")
	public ResponseEntity<Users> addUser(@RequestBody Users user) {

		Users users = null;

		try {
			users = userService.addUser(user);
		} catch (Exception e) {
			e.getMessage();
		}

		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}

//	@RequestMapping("/adduser")
//	public Users addUsers(@RequestBody Users user) {
//		 return userService.addOrUpdateUser(user);
//	}
	
	@PutMapping("/{id}")
	public Users udpateUser(@RequestBody Users user, @PathVariable("id") int userId) {
		return userService.updateUser(user, userId);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserById(@PathVariable("id") int userId) {
		userService.deleteUser(userId);
	}
	
	@GetMapping("/getUsersBySalary/{salary}")
	public List<Users> getAllUsersBySalary(
				@PathVariable("salary") float salary
			) {
		
		List<Users> users = null;
		
		try {
			users = userService.getUserBySalary(salary);
		} catch (Exception e) {
			e.getMessage();
		}
		
		return users;
	}
	
	

}
