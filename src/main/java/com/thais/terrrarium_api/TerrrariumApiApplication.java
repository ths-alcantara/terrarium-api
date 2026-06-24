package com.thais.terrrarium_api;

import jakarta.servlet.annotation.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TerrrariumApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerrrariumApiApplication.class, args);
	}

}
