package com.khanhspring.ciwithjenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CiWithJenkinsDemoApplication {

  
	public static void main(String[] args) {
		SpringApplication.run(CiWithJenkinsDemoApplication.class, args);
	}
}
