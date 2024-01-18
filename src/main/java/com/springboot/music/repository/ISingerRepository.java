package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.music.model.Singer;

public interface ISingerRepository extends JpaRepository<Singer, Long> {

}
