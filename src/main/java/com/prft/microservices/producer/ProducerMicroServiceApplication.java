package com.prft.microservices.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProducerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerMicroServiceApplication.class, args);
	}

}
