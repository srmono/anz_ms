package com.anz.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.demo.entity.Users;
import com.anz.demo.exception.ResourceNotFoundException;
import com.anz.demo.repository.UserRepository;
import com.anz.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Users getUserById(int userId) {
		// TODO Auto-generated method stub
		return userRepo
					.findById(userId)
					.orElseThrow( () -> new ResourceNotFoundException(
							"User not Found with id: " + userId
							));
	}

	@Override
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		userRepo.deleteById(userId);
	}

	@Override
	public List<Users> getUserBySalary(float salary) {
		// TODO Auto-generated method stub
		return userRepo.getUsersBySalary(salary);
	}

	@Override
	public Users updateUser(Users user, int userId) {
		Users existingUser = userRepo.findById(userId).get();
		existingUser.setName(user.getName());
		existingUser.setAge(user.getAge());
		existingUser.setSalary(user.getSalary());
		
		Users updatedUser = userRepo.save(existingUser);
		
		return updatedUser;
	}

}
