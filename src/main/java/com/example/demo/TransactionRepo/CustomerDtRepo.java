package com.example.demo.TransactionRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.TransactionModel.CustomerDetails;

public interface CustomerDtRepo extends JpaRepository<CustomerDetails, Integer> {

}
 