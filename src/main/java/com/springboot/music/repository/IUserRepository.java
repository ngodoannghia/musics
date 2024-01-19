package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.music.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
	User findByUsernameOrEmailOrPhone(String username, String email, String phone);
	User findByUsername(String username);
	boolean existsByUsername(String username);
	boolean existsByEmail(String email);
	boolean existsByPhone(String phone);
}
