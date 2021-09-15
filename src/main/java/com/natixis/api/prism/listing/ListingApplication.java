package com.natixis.api.prism.listing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ListingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListingApplication.class, args);
	}

}
