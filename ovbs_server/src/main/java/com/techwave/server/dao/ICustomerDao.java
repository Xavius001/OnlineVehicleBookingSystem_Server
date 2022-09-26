package com.techwave.server.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techwave.server.model.Customerdb;

@Service
public interface ICustomerDao {
	
	List<Customerdb> getAllCust(); //get
	
	Customerdb getByCustId(String custId); //get
	
	String AddCust(Customerdb C); //post
//	
//	String UpdateCust(Customerdb C); //put
	
	String DeleteCust(String custId); //delete
	
}
