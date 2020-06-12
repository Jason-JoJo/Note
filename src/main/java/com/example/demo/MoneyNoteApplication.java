package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@ComponentScan(basePackages  = {"com.jason.HelloController"})
public class MoneyNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyNoteApplication.class, args);
	}

}
