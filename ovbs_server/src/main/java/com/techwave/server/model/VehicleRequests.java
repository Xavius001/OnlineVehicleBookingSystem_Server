package com.techwave.server.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class VehicleRequests {
	@Id
	private String vehicleId;
	private String manufactureName;
	private Integer price;
	private String color;
	private Integer stock;
	private String branchId;
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public VehicleRequests(String vehicleId, String manufactureName, Integer price, String color, Integer stock,
			String branchId) {
		this.vehicleId = vehicleId;
		this.manufactureName = manufactureName;
		this.price = price;
		this.color = color;
		this.stock = stock;
		this.branchId = branchId;
	}
	public VehicleRequests() {}
	
	
}
