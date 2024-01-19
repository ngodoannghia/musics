package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.music.model.Album;

@Repository
public interface IAlbumRepository extends JpaRepository<Album, Long> {

}
