package com.springboot.music.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "album")
public class Album {
	private long id;
	private String name;
	
	public Album() {
		
	}
	public Album(String name) {
		this.name = name;
	}
	@Id
	@Column(name="id_album")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
	
    @Column(name="name")
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
}
