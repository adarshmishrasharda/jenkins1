package com.BankManagementSystem.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerController {
	
	
	
	@GetMapping("/welcome")
	public String getMessage()
	{
		return "welcome to aws assignmnet";
	}
	
	

}
