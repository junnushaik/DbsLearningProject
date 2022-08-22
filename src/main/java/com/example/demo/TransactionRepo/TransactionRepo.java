package com.example.demo.TransactionRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.TransactionModel.TransactionDetails;

public interface TransactionRepo extends JpaRepository<TransactionDetails, Integer> {

}
