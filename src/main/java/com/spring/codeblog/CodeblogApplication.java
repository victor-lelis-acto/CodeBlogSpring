package com.spring.codeblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = {"com.spring.codeblog.model"})
@SpringBootApplication
public class CodeblogApplication {
	public static void main(String[] args) {
		SpringApplication.run(CodeblogApplication.class, args);
	}

}
