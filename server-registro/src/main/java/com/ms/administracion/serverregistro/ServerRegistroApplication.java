package com.ms.administracion.serverregistro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerRegistroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRegistroApplication.class, args);
	}

}
