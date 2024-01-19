package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.music.model.ERole;
import com.springboot.music.model.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
	Role findByName(ERole name);
}
