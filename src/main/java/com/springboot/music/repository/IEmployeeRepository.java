package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.music.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long>{
	
}
