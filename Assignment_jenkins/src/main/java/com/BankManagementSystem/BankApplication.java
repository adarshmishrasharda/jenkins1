package com.BankManagementSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication implements CommandLineRunner {
	
	
	public static final Logger logger= LoggerFactory.getLogger(BankApplication.class);

	public static void main(String[] args) {
		
		logger.info("its continuous integration jod with build and test");
		SpringApplication.run(BankApplication.class, args);
	}

	@Override 
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("its second logger");
		
	}

}
     
 