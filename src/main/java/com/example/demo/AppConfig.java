package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    Product product1()
	{
		return new Product("Azucar", 1, 1300);
	}
    @Bean
    Product product2()
	{
		return new Product();
	}
    @Bean
    User user()
	{
		return new User();
	}
}
