package com.techwave.server.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techwave.server.model.Logindb;

@Service
public interface ILoginDao {
	
	List<Logindb> getAllLogins(); //get
	
	Logindb getByLoginId(String loginId); //get
	
	String AddLogin(Logindb L); //post
	
	String UpdateLogin(Logindb L, String loginId); //put
	
	String ApproveLogin(Logindb L, String loginId);
	
	String RejectLogin(Logindb L, String loginId);
	
	String DeleteLogin(String loginId); //delete
	
}
