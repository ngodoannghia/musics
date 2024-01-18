package com.springboot.music.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "song")
public class Song {
	private long id;
	private String title;
	private String description;
	private String lyris;
	private Date create_at;
	private Date update_at;
	private Date publish_at;
	private String pack;
	private String link_mp3;
	private float duration;
	private Category category;
	
	public Song() {
		
	}

	@Id
	@Column(name="id_song")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    @Column(name="title", length=255)
    public String getTitle() {
    	return title;
    }
    public void setTitle(String title) {
    	this.title = title;
    }
    
    @Column(name="description", length=255)
    public String getDescription() {
    	return description;
    }
    public void setDescription(String description) {
    	this.description = description;
    }
    
    @Column(name="lyris", length=255)
    public String getLyris() {
    	return lyris;
    }
    public void setLyris(String lyris) {
    	this.lyris = lyris;
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
    
    @Column(name="publish_at")
    @Temporal(value = TemporalType.TIMESTAMP)
    public Date getPublish_at() {
    	return publish_at;
    }
    public void setPublish_at(Date publish_at) {
    	this.publish_at = publish_at;
    }
    
    @Column(name="pack")
    public String getPack() {
    	return pack;
    }
    public void setPack(String pack) {
    	this.pack = pack;
    }
    
    @Column(name="link_mp3")
    public String getLink_mp3() {
    	return link_mp3;
    }
    public void setLink_mp3(String link_mp3) {
    	this.link_mp3 = link_mp3;
    }
    
    @Column(name="duration")
    public float getDuration() {
    	return duration;
    }
    public void setDuration(float duration) {
    	this.duration = duration;
    }
    
    @ManyToOne
    @JoinColumn(name="id_category")
    public Category getCategory() {
    	return category;
    }
    public void setCategory(Category category) {
    	this.category = category;
    }
}
