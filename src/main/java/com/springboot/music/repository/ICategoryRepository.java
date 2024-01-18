package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.music.model.Category;

public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
