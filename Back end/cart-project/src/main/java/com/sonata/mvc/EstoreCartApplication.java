package com.sonata.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.sonata.controller", "com.sonata.mvc"})
public class EstoreCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoreCartApplication.class, args);
	}

}
