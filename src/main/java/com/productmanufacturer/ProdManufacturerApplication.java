package com.productmanufacturer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProdManufacturerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdManufacturerApplication.class, args);
	}

}
