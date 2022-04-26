package com.managerapp.managerapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan({"com.managerapp.managerapp.service"})

class ManagerappApplicationTests {

	@Test
	void contextLoads() {
	}

}
