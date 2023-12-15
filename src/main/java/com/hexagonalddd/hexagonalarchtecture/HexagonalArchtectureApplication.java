package com.hexagonalddd.hexagonalarchtecture;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@OpenAPIDefinition
public class HexagonalArchtectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(HexagonalArchtectureApplication.class, args);
    }

}
