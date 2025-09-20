package com.platform.discovery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main class for the Discovery Service application.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceApplication {
    /**
     * Main method to run the Spring Boot application.
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(DiscoveryServiceApplication.class, args);
    }

}
