package com.steve.gradle.spring.gradlespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@EnableConfigurationProperties(myConfig.class)
public class GradleSpringApplication implements CommandLineRunner {

	@Autowired
	myConfig myConfig;

	public static void main(String[] args) {
		SpringApplication.run(GradleSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test run name:" + myConfig.getName());
		System.out.println("Test run age:" + myConfig.getAge());

		//System.exit(0);
	}
}
