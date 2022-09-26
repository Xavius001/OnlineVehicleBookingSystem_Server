package com.techwave.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techwave.server.model.Customerdb;

@Repository
public interface CustomerRepository extends JpaRepository<Customerdb, Integer>{
	
}
