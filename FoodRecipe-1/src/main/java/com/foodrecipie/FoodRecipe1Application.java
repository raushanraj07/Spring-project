package com.foodrecipie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.foodrecipie")
public class FoodRecipe1Application {

	public static void main(String[] args) {
		SpringApplication.run(FoodRecipe1Application.class, args);
	}

}
