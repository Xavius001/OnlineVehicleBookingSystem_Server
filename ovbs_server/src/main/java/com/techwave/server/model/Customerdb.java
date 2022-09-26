package com.techwave.server.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Customerdb implements Serializable {
	@OneToOne
	private Logindb custId;
	@Id
	private String name;
	private LocalDate dob;
	private String address;
	private String email;
	private String pno;
	private String occupation;

	public Logindb getcustId() {
		return custId;
	}

	public void setcustId(Logindb custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
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

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Customerdb(Logindb custId, String name, LocalDate dob, String address, String email,
			String pno, String occupation) {
		super();
		this.custId = custId;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.pno = pno;
		this.occupation = occupation;
	}

	public Customerdb() {}
	
}
