package com.abm.proyectoabm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
      
@SpringBootApplication(scanBasePackages= {"com.vz.spring.items"})
public class ProyectoabmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoabmApplication.class, args);
	}

}