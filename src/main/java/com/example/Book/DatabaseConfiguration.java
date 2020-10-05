package com.example.Book;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DatabaseConfiguration {

	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource")
	public DataSourceProperties defaultDataSourceProperties() {
		System.out.println("new DataSourceProperties()" + new DataSourceProperties());
		DataSourceProperties data = new DataSourceProperties();
		return data;
	}

	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource")
	public DataSource dataSource() {
		return defaultDataSourceProperties().initializeDataSourceBuilder().build();
	}

}
