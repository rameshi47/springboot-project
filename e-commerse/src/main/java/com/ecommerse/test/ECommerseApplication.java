package com.ecommerse.test;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerseApplication.class, args);
		SpringApplication application = new SpringApplication(ECommerseApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
	}

}
