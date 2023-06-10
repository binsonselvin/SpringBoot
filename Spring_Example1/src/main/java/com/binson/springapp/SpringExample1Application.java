package com.binson.springapp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.binson.springapp.controller","com.binson.springapp"})
public class SpringExample1Application {

	private static ConfigurableApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringExample1Application.class, args);
		//restart();
	}

	public static void restart() {
		ApplicationArguments args = context.getBean(ApplicationArguments.class);
		
		Thread thread = new Thread( ()-> {
			context.close();
			context = SpringApplication.run(SpringExample1Application.class, args.getSourceArgs());
		});
		
		thread.setDaemon(false);
		thread.start();
	}
}
