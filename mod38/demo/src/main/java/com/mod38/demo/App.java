package com.mod38.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.mod38.demo.repository")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
