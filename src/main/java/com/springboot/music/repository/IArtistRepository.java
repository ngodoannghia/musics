package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.music.model.Artist;

@Repository
public interface IArtistRepository extends JpaRepository<Artist, Long> {

}
