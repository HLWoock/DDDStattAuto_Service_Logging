package de.woock.ddd.stattauto.loggingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class DddStattAutoSrvLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DddStattAutoSrvLoggingApplication.class, args);
	}
}
