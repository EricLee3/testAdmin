package com.testAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.boot.web.support.SpringBootServletInitializer;

/*
@Configuration
@EnableAutoConfiguration(exclude={DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class})
@ComponentScan(basePackages="com.testAdmin")
*/
@SpringBootApplication
public class TestAdminApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TestAdminApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)  {
		return application.sources(TestAdminApplication.class);
	}	
}
