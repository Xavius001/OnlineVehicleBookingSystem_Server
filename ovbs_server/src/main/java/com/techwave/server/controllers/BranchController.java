package com.techwave.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techwave.server.dao.BranchDao;
import com.techwave.server.model.Branchdb;
import com.techwave.server.model.Logindb;

@RestController
public class BranchController {
	
	@Autowired
	BranchDao branchDao;
	
	@GetMapping("getAllBranches")
	public List<Branchdb> getAllBranches() {
		List<Branchdb> list = branchDao.getAllBranches();
		return list;
	}

	@GetMapping("getByBranchId/{branchId}")
	public Branchdb getByBranchId(@PathVariable("branchId") String branchId) {
		return branchDao.getByBranchId(branchId);
	}

	@PostMapping("AddBranch")
	public String AddBranch(@RequestBody Branchdb B) {
		return branchDao.AddBranch(B);
	}

	@DeleteMapping("DeleteBranch/{branchId}")
	public String DeleteBranch(@PathVariable("branchId") String branchId) {
		return branchDao.DeleteBranch(branchDao.getByBranchId(branchId));
	}
	
}
