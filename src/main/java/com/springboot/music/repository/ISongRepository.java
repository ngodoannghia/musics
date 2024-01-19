package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.music.model.Song;

@Repository
public interface ISongRepository extends JpaRepository<Song, Long> {

}
