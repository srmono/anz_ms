package com.anz.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "user_id")
	private int useId;
	
	//@Column(name = "name")
	private String name;
	
	//@Column(name = "age")
	private int age;
	
	//@Column(name = "salary")
	private float salary;
	
	//@Column(name = "department_id")
	private int departmentId;
}
