package com.ak.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"com.ak.service", "com.ak.DAO", "com.ak.controller"})
@EnableAutoConfiguration
@EnableJpaRepositories("com.ak.dao")
@EntityScan ("com.ak.entity")

public class Main {
	
	public static void main(String[] args){
//		ConfigurableApplicationContext ctx = 
		SpringApplication.run(Main.class, args);
		System.out.println("działa");
		//defaultowo je�eli jest nazwa banner w spring.boot to sie wywo�uje!

	}

}
