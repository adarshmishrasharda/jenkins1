package com.BankManagementSystem;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BankApplicationTests {
	
	public static final Logger logger= LoggerFactory.getLogger(BankApplication.class);


	@Test
	void contextLoads() {
		logger.info("this is test class");
		assertEquals(true, true);
	
	}

}
