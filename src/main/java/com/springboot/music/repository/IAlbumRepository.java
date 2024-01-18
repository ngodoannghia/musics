package com.springboot.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.music.model.Album;

public interface IAlbumRepository extends JpaRepository<Album, Long> {

}
