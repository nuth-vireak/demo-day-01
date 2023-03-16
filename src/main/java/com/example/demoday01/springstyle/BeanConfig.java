package com.example.demoday01.springstyle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Circle circle() {
        return new Circle();
    }

    @Bean
    public Triangle triangle() {
        return new Triangle();
    }
}
