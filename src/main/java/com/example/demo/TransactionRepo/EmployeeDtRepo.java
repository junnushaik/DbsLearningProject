package com.example.demo.TransactionRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.TransactionModel.EmployeeDetails;

public interface EmployeeDtRepo extends JpaRepository<EmployeeDetails, Integer> {

	EmployeeDetails findByUserName(String username);

}
