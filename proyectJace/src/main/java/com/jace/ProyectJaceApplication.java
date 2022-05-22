package com.jace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jace.service.UserServiceImpl;

@SpringBootApplication

public class ProyectJaceApplication  {	
	public static void main(String[] args) {
		SpringApplication.run(ProyectJaceApplication.class, args);
	}


}
