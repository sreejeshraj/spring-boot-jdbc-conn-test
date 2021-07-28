package com.ustglobal;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@Data
@SpringBootApplication
public class MainClass implements ApplicationRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n\n***** Hello Spring Boot from console! *****\n\n");
		String version = jdbcTemplate.queryForObject("SELECT version()",String.class);
		System.out.println("\n\n***************************************************************************************");
		System.out.println("DB version: "+version);
		System.out.println("***************************************************************************************\n\n");
		System.out.println("\n\n***** EXITING!!!  *****\n\n");
		System.exit(0);
	}



}
