package com.greglixandrao.designpatternsspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * The DesignPatternsSpringApplication class implements an application that
 * demonstrates the use of design patterns in a Spring Boot application.
 * This application uses the OpenFeign library to consume a REST API.
 * The application uses the Builder, Singleton, and Factory Method design patterns.
 * The application also demonstrates the use of the @Entity annotation to create
 * JPA entities.
 *
 * @author greglixandrao
 */


@EnableFeignClients
@SpringBootApplication
public class DesignPatternsSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsSpringApplication.class, args);
    }

}
