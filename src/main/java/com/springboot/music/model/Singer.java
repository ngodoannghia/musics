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
@Table(name = "artist")
public class Singer {
	private long id;
	private String name;
	private String avatar;
	private Date dateofbirth;
	private Date create_at;
	private Date update_at;
	
	public Singer() {
		
	}
	
	public Singer(String name) {
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
    
    @Column(name="name", length=255, nullable=false)
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    
    @Column(name="avatar", columnDefinition="TEXT")
    public String getAvatar() {
    	return avatar;
    }
    public void setAvatar(String avatar) {
    	this.avatar = avatar;
    }
    
	@Column(name="dateofbirth", columnDefinition="DATETIME")
	public Date getDate() {
		return dateofbirth;
	}
	public void setDate(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
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
