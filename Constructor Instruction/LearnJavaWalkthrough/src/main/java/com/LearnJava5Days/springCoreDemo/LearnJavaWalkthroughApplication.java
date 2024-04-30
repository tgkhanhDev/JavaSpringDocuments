package com.LearnJava5Days.springCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.LearnJava5Days.springCoreDemo",
				"com.LearnJava5Days.utils"}
)
public class LearnJavaWalkthroughApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJavaWalkthroughApplication.class, args);
	}

}
