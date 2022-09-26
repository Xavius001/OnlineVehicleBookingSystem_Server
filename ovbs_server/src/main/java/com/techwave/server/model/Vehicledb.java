package com.techwave.server.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
public class Vehicledb implements Serializable {
	@Id
	private String vehicleId;
	private String manufactureName;
	private String color;
	private Integer seatingCapacity;
	private Integer price;
	@ManyToOne
	@JoinColumn(name = "branch_id", referencedColumnName = "branch_id_user_id")
	private Branchdb branchId;
	private Integer stock;
	
	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Branchdb getbranchId() {
		return branchId;
	}

	public void setbranchId(Branchdb branchId) {
		this.branchId = branchId;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Vehicledb(String vehicleId, String manufactureName, String color, Integer seatingCapacity, Integer price, Branchdb branchId,
			Integer stock) {
		super();
		this.vehicleId = vehicleId;
		this.manufactureName = manufactureName;
		this.color = color;
		this.seatingCapacity = seatingCapacity;
		this.price = price;
		this.branchId = branchId;
		this.stock = stock;
	}

	public Vehicledb() {}
	
}
