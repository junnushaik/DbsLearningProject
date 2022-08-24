package com.example.demo.TransactionRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.TransactionModel.CustomerDetails;

public interface CustomerDtRepo extends JpaRepository<CustomerDetails, Integer> {

	CustomerDetails findByaccountno(long accountno);

	//CustomerDetails findByAccount_No(long accNo);

	

	//CustomerDetails findByAccount_No(long accNo);

	//CustomerDetails findByaccount_No(long accNo);

}
 