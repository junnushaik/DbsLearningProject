package com.example.demo.TransactionController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.TransactionModel.CustomerDetails;
import com.example.demo.TransactionModel.TransactionDetails;
import com.example.demo.TransactionService.TransServiceM;

@RestController
public class TranController {
	@Autowired
	TransServiceM tsm;
	
	@RequestMapping("/admin")
	public String welcome()
	{
		return "Welcome to DBS Transactions Process";
	}
	@GetMapping("/checksender")
	public CustomerDetails CheckSenderDetails(@RequestParam long accountno) {
		
		
		
		return tsm.getsenderdetails(accountno);
	}
	
	@GetMapping("/checkreceiver")
	public long CheckRecieverDetails(@RequestParam long raccountno) {
		return tsm.getReceiverdetails(raccountno);
		
	}
	
	@GetMapping("/checkbalanceandtransfer")
	public  float CheckbalanceT(@RequestBody CustomerDetails CD, @RequestParam float amount) {
		return tsm.CheckBalance(CD,amount);
		
	}
	
	@GetMapping("/updateTransaction")
	public List<TransactionDetails> TransactionUpdate(TransactionDetails TD){
		return tsm.UpdateTransaction(TD);
	}
	
	@GetMapping("/CheckAccountBalance")
	public float CheckAccountBalance(@RequestParam long accountno) {
		
		
		
		CustomerDetails cd= tsm.CheckABalance(accountno);
		return cd.getBalance();
	}
	
	@PostMapping("/AddEmployeeDetails")
	public String userWelcome()
	{
		return "Welcome to Spring User page";
	} 


}
 