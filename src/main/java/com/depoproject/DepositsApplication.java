package com.depoproject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Deposits API", version = "1.0", description = "API for managing deposits")
)
public class DepositsApplication {

	public static void main(String[] args) {

		SpringApplication.run(DepositsApplication.class, args);
	}

}
