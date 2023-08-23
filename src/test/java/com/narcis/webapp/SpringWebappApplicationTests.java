package com.narcis.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringWebappApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testGetController() {
		
	}
	@Test
	void contextLoads() {
	}

}
