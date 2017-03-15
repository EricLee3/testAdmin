package com.testAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude={DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class})
@ComponentScan(basePackages="com.testAdmin")
public class TestAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAdminApplication.class, args);
	}
	
	
}
