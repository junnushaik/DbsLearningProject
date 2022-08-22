package com.example.demo.TransactionRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.TransactionModel.BankDetails;

public interface BankDtRepo extends JpaRepository<BankDetails, Integer> {

}
