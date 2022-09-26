package com.techwave.server.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class CustomerBooking implements Serializable {
	@Id
	private String bookingId;
	@ManyToOne
	@JoinColumn(name = "cust_id", referencedColumnName = "cust_id_user_id")
	private Customerdb custId;
	@ManyToOne
	private Vehicledb vehicleId;
	@ManyToOne
	@JoinColumn(name = "branch_id", referencedColumnName = "branch_id_user_id")
	private Branchdb branchId;
	private String status;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public Customerdb getCustId() {
		return custId;
	}

	public void setCustId(Customerdb custId) {
		this.custId = custId;
	}

	public Vehicledb getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Vehicledb vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Branchdb getBranchId() {
		return branchId;
	}

	public void setBranchId(Branchdb branchId) {
		this.branchId = branchId;
	}

	public CustomerBooking(String bookingId, Customerdb custId, Vehicledb vehicleId, Branchdb branchId, String status) {
		super();
		this.bookingId = bookingId;
		this.custId = custId;
		this.vehicleId = vehicleId;
		this.branchId = branchId;
		this.status = status;
	}

	public CustomerBooking() {}
	
}
