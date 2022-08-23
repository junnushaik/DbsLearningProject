 package com.example.demo.TransactionController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TranController {
	
	@RequestMapping("/home")
	public String welcome()
	{
		return "Welcome to Spring home page";
	}
	@GetMapping("/admin")
	public String adminWelcome() {
		return "Welcome to Spring Admin Page";
	}
	@PostMapping("/AddEmployeeDetails")
	public String userWelcome()
	{
		return "Welcome to Spring User page";
	}


}
