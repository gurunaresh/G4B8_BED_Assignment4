package com.glearning.employeemgmt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.glearning.employeemgmt.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
	@Query("SELECT u FROM User u WHERE u.username = ?1")
    public User getUserByUsername(String username);
    
	Optional<User> findByUsername(String username);
}
