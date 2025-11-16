package com.service.E_commerce;

import org.springframework.boot.SpringApplication;

public class TestECommerceProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ECommerceProductServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
