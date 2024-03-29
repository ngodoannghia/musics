package com.springboot.music.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
	private long id;
	private String name;
	private Date dateofbirth;
	private String username;
	private String password;
	private Set<Role> roles = new HashSet<>();
	private EPack pack;
	private Date create_at;
	private Date update_at;
	private String address;
	private String phone;
	private String avatar;
	private String email;
	
	public User() {
		
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public User(String username, String email, String password) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	@Id
	@Column(name="id_user")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
	
	@Column(name="name", length=255)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="dateofbirth", columnDefinition="DATETIME")
	public Date getDate() {
		return dateofbirth;
	}
	public void setDate(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	@Column(name="username", length=255, nullable=false, unique = true)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name="password", length=255, nullable=false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", 
               joinColumns = @JoinColumn(name = "id_user"),
               inverseJoinColumns = @JoinColumn(name = "id_role"))
	@Column(name="roles", length=100)
	public Set<Role> getRoles() {
	    return roles;
	}
	public void setRoles(Set<Role> roles) {
	    this.roles = roles;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="pack", length=100)
	public EPack getPack() {
		return pack;
	}
	public void setPack(EPack pack) {
		this.pack = pack;
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
	
	@Column(name="address", length=255)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="phone", length=100, unique=true)
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(name="avatar", columnDefinition="TEXT")
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	@Column(name="email", length=255, unique=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
