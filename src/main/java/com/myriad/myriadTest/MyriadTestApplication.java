package com.myriad.myriadTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EntityScan(basePackages = "com.myriad.myriadTest.model")
public class MyriadTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyriadTestApplication.class, args);

		System.out.println("hello world");
	}

}
