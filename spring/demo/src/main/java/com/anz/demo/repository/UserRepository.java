package com.anz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anz.demo.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
