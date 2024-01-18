package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.music.model.Artist;

public interface IArtistRepository extends JpaRepository<Artist, Long> {

}
