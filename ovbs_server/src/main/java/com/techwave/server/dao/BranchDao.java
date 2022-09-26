package com.techwave.server.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techwave.server.model.Branchdb;
import com.techwave.server.model.Logindb;
import com.techwave.server.repository.BranchRepository;

@Service
public class BranchDao implements IBranchDao {
	
	@Autowired
	BranchRepository brRepository;

	@Override
	public List<Branchdb> getAllBranches() {
		// TODO Auto-generated method stub
		List<Branchdb> list = brRepository.findAll();
		return list;
	}

	@Override
	public Branchdb getByBranchId(String branchId) {
		// TODO Auto-generated method stub
		Branchdb B;
		try {
			B = getAllBranches().stream().filter(i->i.getbranchId().getUserId().equals(branchId)).collect(Collectors.toList()).get(0);
			if(B!=null) {
				System.out.println(B);
				return B;
			}
			else {
				throw new Exception();
			}
		}
		catch(Exception E) {
			return null;
		}
	}

	@Override
	public String AddBranch(Branchdb B) {
		// TODO Auto-generated method stub
		brRepository.save(B);
		return "Branch added";
	}

	@Override
	public String DeleteBranch(Branchdb bd) {
		// TODO Auto-generated method stub
		Branchdb B = getByBranchId(bd.getbranchId().getUserId());
		if(B==null) {
			return "No branch was found.";
		}
		else {
			brRepository.delete(B);
			return "Branch deleted";
		}
	}
}
