package com.navin.Acting.Acting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ActingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActingApplication.class, args);
	}

}
