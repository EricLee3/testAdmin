package com.testAdmin.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Data;

@ConfigurationProperties(prefix=MasterDatabaseProperties.PREFIX)
@Data
public class MasterDatabaseProperties implements DatabaseProperties {
	public static final String PREFIX="datasource";
	
	private String driverClassName;
	
	private String url;
	
	private String userName;
	
	private String password;
	
	private int initialSize;
	
	private int maxActive;
	
	private int maxIdle;
	
	private int minIdle;
	
	private int maxWait;
}
