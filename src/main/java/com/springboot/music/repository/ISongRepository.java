package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.music.model.Song;

public interface ISongRepository extends JpaRepository<Song, Long> {

}
