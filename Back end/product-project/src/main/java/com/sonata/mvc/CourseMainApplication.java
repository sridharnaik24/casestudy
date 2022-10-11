package com.sonata.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.sonata.controller", "com.sonata.mvc"})
public class CourseMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseMainApplication.class, args);
	}

}