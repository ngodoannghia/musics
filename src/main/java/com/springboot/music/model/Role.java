package com.springboot.music.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="role")
public class Role {
  	private long id;
  	private ERole name;
  	
  	public Role() {
  		
  	}
  	public Role(ERole name) {
  		this.name = name;
  	}
  	
	@Id
	@Column(name="id_role")
    @GeneratedValue(strategy = GenerationType.AUTO)
  	public long getId() {
  		return id;
  	}
  	public void setId(long id) {
  		this.id = id;
  	}
  	
  	@Enumerated(EnumType.STRING)
  	@Column(name="role", length=50, nullable=false, unique = true)
  	public ERole getName() {
  		return name;
  	}
  	public void setName(ERole name) {
  		this.name = name;
  	}
  	
}
