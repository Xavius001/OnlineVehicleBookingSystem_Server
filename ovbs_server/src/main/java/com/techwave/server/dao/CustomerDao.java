package com.techwave.server.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techwave.server.model.Branchdb;
import com.techwave.server.model.Customerdb;
import com.techwave.server.repository.CustomerRepository;

@Service
public class CustomerDao implements ICustomerDao {

	@Autowired
	CustomerRepository custRepository;
	
	@Override
	public List<Customerdb> getAllCust() {
		List<Customerdb> list = custRepository.findAll();
		return list;
	}

	@Override
	public Customerdb getByCustId(String custId) {
		Customerdb C;
		try {
			C = getAllCust().stream().filter(i->i.getcustId().getUserId().equals(custId)).collect(Collectors.toList()).get(0);
			if(C!=null) {
				
				return C;
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
	public String AddCust(Customerdb C) {
		// TODO Auto-generated method stub
		custRepository.save(C);
		return "Customer added!";
	}

//	@Override
//	public String UpdateCust(Customerdb C) {
//		// TODO Auto-generated method stub
//		Customerdb old = getByCustId(C.getcustId().getUserId());
//		old.set
//		return null;
//	}

	@Override
	public String DeleteCust(String custId) {
		// TODO Auto-generated method stub
		custRepository.delete(getByCustId(custId));
		return "Customer deleted";
	}
}
