package com.techwave.server.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techwave.server.model.Logindb;
import com.techwave.server.repository.LoginRepository;

@Service
public class LoginDao implements ILoginDao {

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public String AddLogin(Logindb L) {
		loginRepository.save(L);
		return "Your account has been created successfully!";
	}

	@Override
	public List<Logindb> getAllLogins() {
		// TODO Auto-generated method stub
		List<Logindb> list = loginRepository.findAll();
		return list;
	}

	@Override
	public Logindb getByLoginId(String loginId) {
		Logindb L;
		try {
			L = getAllLogins().stream().filter(i->i.getUserId().equals(loginId)).collect(Collectors.toList()).get(0);
			if(L!=null) {
				return L;
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
	public String UpdateLogin(Logindb L, String loginId) {
		Logindb old = getByLoginId(loginId);
		old.setStatus(L.getStatus());
		return "Login Status updated.";
	}
	
	@Override
	public String ApproveLogin(Logindb L, String loginId) {
		Logindb old = getByLoginId(loginId);
		if(old==null) {
			return "No login found with this Id";
		}
		else {
			old.setStatus("approved");
			loginRepository.save(old);
			return "Login Status approved.";
		}
	}
	
	@Override
	public String RejectLogin(Logindb L, String loginId) {
		Logindb old = getByLoginId(loginId);
		if(old==null) {
			return "No Vendor found with this Id";
		}
		else {
			old.setStatus("rejected");
			loginRepository.save(old);
			return "Login Status approved.";
		}
	}

	@Override
	public String DeleteLogin(String loginId) {
		loginRepository.delete(getByLoginId(loginId));
		return "Login Deleted";
	}

}
