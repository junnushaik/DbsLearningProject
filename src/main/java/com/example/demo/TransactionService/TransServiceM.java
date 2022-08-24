package com.example.demo.TransactionService;

import java.util.List;
//import java.util.Optional;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.TransactionModel.CustomerDetails;
import com.example.demo.TransactionModel.TerrorList;
import com.example.demo.TransactionModel.TransactionDetails;
import com.example.demo.TransactionRepo.CustomerDtRepo;
import com.example.demo.TransactionRepo.TerrorListRepo;
import com.example.demo.TransactionRepo.TransactionRepo;
@Service
public class TransServiceM {
	//static int tranid=0;
	@Autowired
	CustomerDtRepo er;
	
	@Autowired
	TerrorListRepo tr;
	
	@Autowired
	TransactionRepo td;
	

	public CustomerDetails getsenderdetails(long accountno) {
		// TODO Auto-generated method stub
	
		CustomerDetails cd=er.findByaccountno(accountno);
		if(cd!=null)
			return cd;
		else
			return null;
	}

	@SuppressWarnings("null")
	public long getReceiverdetails(long accountno) {
		// TODO Auto-generated method stub
	TerrorList tl=tr.findByraccountno(accountno);
		if(tl==null)
			return accountno;
		else
			return (Long) null;
		
	}

	@SuppressWarnings("null")
	public float CheckBalance(CustomerDetails cd, float amount)
	{
		// TODO Auto-generated method stub
			if (cd.isOverdraft())
				cd.setBalance(cd.getBalance()-amount);
			else if(cd.getBalance()>=amount)
				cd.setBalance(cd.getBalance()-amount);
			else 
				return (Float) null;
			return amount;
			
	}
	
	public List<TransactionDetails> UpdateTransaction(TransactionDetails Td ){
		td.save(Td);
		return td.findAll();
}

	public CustomerDetails CheckABalance(long accountno) {
		// TODO Auto-generated method stub
		return er.findByaccountno(accountno);
	}
}