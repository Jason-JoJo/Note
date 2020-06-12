package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
 
@SpringBootApplication
@ComponentScan(basePackages  = {"com.jason.helloController, com.aop.LogAspect"})
@MapperScan(basePackages = "com.jason.dao")
public class MoneyNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyNoteApplication.class, args);
	}

}
