package com.itgurukul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZomatoGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZomatoGatewayApplication.class, args);
	}

}