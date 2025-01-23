package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationContextApp
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(ApplicationContextApp.class, args);
	    
		Product prod1 = (Product) context.getBean("product1");
		Product prod2 = (Product) context.getBean("product2");
		User user = context.getBean(User.class);

	    System.out.println(prod1);
	    System.out.println(prod2);
	    System.out.println(user);
	}
}
