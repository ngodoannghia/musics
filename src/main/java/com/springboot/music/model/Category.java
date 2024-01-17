package com.springboot.music.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "category")
public class Category {	
	private long id;
	private String name;
	private Date create_at;
	private Date update_at;
	
	public Category() {
		
	}
	
	public Category(String name) {
		this.name = name;
	}
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name="name", length=255, nullable = false)
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    
    @Column(name="create_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    public Date getCreate_at() {
    	return create_at;
    }
    public void setCreate_at(Date create_at) {
    	this.create_at = create_at;
    }
    
    @Column(name="update_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    public Date getUpdate_at() {
    	return update_at;
    }
    public void setUpdate_at(Date update_at) {
    	this.update_at = update_at;
    }
    
}
