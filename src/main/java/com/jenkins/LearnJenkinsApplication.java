package com.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJenkinsApplication implements CommandLineRunner{
	
	public static final Logger logger = LoggerFactory.getLogger(LearnJenkinsApplication.class);

	public static void main(String[] args) {
		logger.info("This is first logger");
		SpringApplication.run(LearnJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("This is second logger");
	}

}
