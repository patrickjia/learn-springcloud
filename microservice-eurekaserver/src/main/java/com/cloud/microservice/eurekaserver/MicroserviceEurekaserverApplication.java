package com.cloud.microservice.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceEurekaserverApplication {

	public static void main(String[] args) {

		SpringApplication.run(MicroserviceEurekaserverApplication.class, args);
	}
}
