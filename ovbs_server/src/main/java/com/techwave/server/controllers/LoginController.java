package com.techwave.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techwave.server.dao.LoginDao;
import com.techwave.server.model.Logindb;

@RestController
public class LoginController {
	
	@Autowired
	LoginDao loginDao;
	
	@GetMapping("getAllLogins")
	public List<Logindb> getAllLogins() {
		return loginDao.getAllLogins();
	}
	
	@GetMapping("getByLoginId/{loginId}")
	public Logindb getByLoginId(@PathVariable("loginId") String loginId) {
		return loginDao.getByLoginId(loginId);
	}
	
	@PostMapping("AddLogin")
	public String AddLogin(@RequestBody Logindb L) {
		return loginDao.AddLogin(L);
	}
	
	@PutMapping("UpdateLogin/{loginId}")
	public String UpdateLogin(@RequestBody Logindb L, @PathVariable("loginId") String loginId) {
		return loginDao.UpdateLogin(L, loginId);
	}
	
	@PutMapping("ApproveLogin/{loginId}")
	public String ApproveLogin(@RequestBody Logindb L, @PathVariable("loginId") String loginId) {
		return loginDao.ApproveLogin(L, loginId);
	}
	
	@PutMapping("RejectLogin/{loginId}")
	public String RejectLogin(@RequestBody Logindb L, @PathVariable("loginId") String loginId) {
		return loginDao.RejectLogin(L, loginId);
	}
	
	@DeleteMapping("DeleteLogin/{loginId}")
	public String DeleteLogin(@PathVariable("loginId") String loginId) {
		return loginDao.DeleteLogin(loginId);
	}
}
