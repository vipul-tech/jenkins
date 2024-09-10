package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnJenkinsApplicationTests {
	
	public static final Logger logger = LoggerFactory.getLogger(LearnJenkinsApplication.class);

	@Test
	void contextLoads() {
		logger.info("This is test class");
		assertEquals(true, true);
	}

}
