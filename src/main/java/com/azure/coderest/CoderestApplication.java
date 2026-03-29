package com.azure.coderest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CoderestApplication {
	@Value("${hello.message}")
	String message;
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!"+" {} "+message;
	}

	public static void main(String[] args) {
		SpringApplication.run(CoderestApplication.class, args);
	}

}
