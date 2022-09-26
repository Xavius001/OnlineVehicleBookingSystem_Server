package com.techwave.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techwave.server.model.Logindb;

@Repository
public interface LoginRepository extends JpaRepository<Logindb, Integer> {
	
}
