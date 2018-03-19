package com.reactapp.java.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication is a combination of @ComponenetScan, @EnableAutoConfiguration, @Configuration
 * @author alexander.fournier
 *
 */

@SpringBootApplication
public class DemoApplication {
	
	
	@Value("${multipart.location}/gif/")
	private String songLocation;
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
