package com.nitin.microservices2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UsersEurekaDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersEurekaDiscoveryServiceApplication.class, args);
	}

}
