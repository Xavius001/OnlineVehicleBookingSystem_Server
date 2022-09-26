package com.techwave.server.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Branchdb implements Serializable {
	//@Id
	@OneToOne
	private Logindb branchId;
	@Id
	private String bLoc;
	private String address;
	private String email;
	private String pno;
	
	public Logindb getbranchId() {
		return branchId;
	}

	public void setbranchId(Logindb branchId) {
		this.branchId = branchId;
	}

	public String getbLoc() {
		return bLoc;
	}

	public void setbLoc(String bLoc) {
		this.bLoc = bLoc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}
	
	public Branchdb(Logindb branchId, String bLoc, String address, String email, String pno) {
		super();
		this.branchId = branchId;
		this.bLoc = bLoc;
		this.address = address;
		this.email = email;
		this.pno = pno;
	}

	public Branchdb() {}
	
}
