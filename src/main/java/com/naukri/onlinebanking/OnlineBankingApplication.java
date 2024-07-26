package com.naukri.onlinebanking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OnlineBankingApplication {

	private static final Logger logger = LogManager.getLogger(OnlineBankingApplication.class);

	public static void main(String[] args) {

		logger.info("Inside the main");
		SpringApplication.run(OnlineBankingApplication.class, args);
	}

}
