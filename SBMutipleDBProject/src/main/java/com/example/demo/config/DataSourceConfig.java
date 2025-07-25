package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {
	
	@Bean(name = "mysqlDataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.mysql")
	public DataSource mysqlDatasource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name = "postgresDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.postgres")
	public DataSource postgresDatasource() {
		return DataSourceBuilder.create().build();
	}
	
}
