package com.anz.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anz.demo.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
	
	@Query(value ="select * from users where salary > :salary", nativeQuery = true)
	public List<Users> getUsersBySalary(@Param("salary") float salary);

}
