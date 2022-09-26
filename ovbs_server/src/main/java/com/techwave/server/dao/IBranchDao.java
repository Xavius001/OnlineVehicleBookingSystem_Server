package com.techwave.server.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techwave.server.model.Branchdb;
import com.techwave.server.model.Logindb;

@Service
public interface IBranchDao {
	
	List<Branchdb> getAllBranches(); //get
	
	Branchdb getByBranchId(String branchId); //get
	
	String AddBranch(Branchdb B); //post
	
	String DeleteBranch(Branchdb B); //delete
}
