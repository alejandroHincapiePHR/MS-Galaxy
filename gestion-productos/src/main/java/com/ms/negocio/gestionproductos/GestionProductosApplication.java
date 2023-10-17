package com.ms.negocio.gestionproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GestionProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionProductosApplication.class, args);
	}

}
