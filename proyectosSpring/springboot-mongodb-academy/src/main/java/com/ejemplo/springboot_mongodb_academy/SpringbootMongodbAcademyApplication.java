package com.ejemplo.springboot_mongodb_academy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringbootMongodbAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbAcademyApplication.class, args);
	}

}
