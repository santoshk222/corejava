package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SuperAdmin {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	int sadmid;
	
	String name;
	String email;
	String password;
	public int getSadmid() {
		return sadmid;
	}
	public void setSadmid(int sadmid) {
		this.sadmid = sadmid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public SuperAdmin(int sadmid, String name, String email, String password) {
		super();
		this.sadmid = sadmid;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public SuperAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuperAdmin(int i) {
		this.sadmid=i;
	}
	
	
}
