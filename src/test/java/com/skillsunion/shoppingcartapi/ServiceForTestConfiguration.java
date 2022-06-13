package com.skillsunion.shoppingcartapi;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.skillsunion.shoppingcartapi.service.ServiceForTest;

@TestConfiguration
public class ServiceForTestConfiguration {

	@Bean
	public ServiceForTest serviceForTest() {
		return new ServiceForTest();
	}
}
