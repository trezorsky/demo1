package com.example.demo;

import org.springframework.context.annotation.Bean;

public interface Operation {

    @Bean
    double getResult(double a, double b);

}