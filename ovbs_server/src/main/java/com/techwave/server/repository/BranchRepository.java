package com.techwave.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techwave.server.model.Branchdb;
import com.techwave.server.model.Logindb;

@Repository
public interface BranchRepository extends JpaRepository<Branchdb, Integer> {

}
