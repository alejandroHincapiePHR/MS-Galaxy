package com.ms.negocio.gestionclientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GestionClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionClientesApplication.class, args);
	}

}
