package com.vijay.AdminExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
//import zipkin.server.EnableZipkinServer;
//import zipkin.server.

@SpringBootApplication
@EnableAdminServer
//@EnableZipkinServer
public class AdminExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminExampleApplication.class, args);
	}

}
