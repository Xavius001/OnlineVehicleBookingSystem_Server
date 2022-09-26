package com.techwave.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techwave.server.dao.CustomerDao;
import com.techwave.server.model.Customerdb;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDao custDao;
	
	@GetMapping("getAllCust")
	public List<Customerdb> getAllCust() {
		List<Customerdb> list = custDao.getAllCust();
		return list;
	}

	@GetMapping("getByCustId/{custId}")
	public Customerdb getByCustId(@PathVariable("custId") String custId) {
		Customerdb C = custDao.getByCustId(custId);
		if (C!=null) {
			return C;
		}
		else {
			return null;
		}
	}

	@PostMapping("AddCust")
	public String AddCust(@RequestBody Customerdb C) {
		return custDao.AddCust(C);
	}

	@DeleteMapping("DeleteCust/{custId}")
	public String DeleteCust(@PathVariable("custId") String custId) {
		return custDao.DeleteCust(custId);
	}
}
