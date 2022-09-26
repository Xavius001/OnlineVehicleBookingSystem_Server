package com.techwave.server.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class Logindb implements Serializable {
	@Id
	private String userId;
	private String password;
	private String role;
	private String status;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Logindb(String userId, String password, String role, String status) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.status = status;
	}

	public Logindb() {}
	
}
