package com.anz.demo.service;

import java.util.List;

import com.anz.demo.entity.Users;

public interface UserService {

	public List<Users> getAllUsers();
	public Users getUserById(int userId);
	public Users addUser(Users user);
	public Users updateUser(Users user, int userId);
	public void deleteUser(int userId);
	
	public List<Users> getUserBySalary(float salary);
	
	//public List<UserDepartmentResponse> getUserDepartment()
	
}
