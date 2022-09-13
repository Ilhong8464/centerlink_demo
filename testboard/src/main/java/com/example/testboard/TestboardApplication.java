package com.example.testboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TestboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestboardApplication.class, args);
    }

}
