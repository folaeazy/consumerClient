package com.consumer;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableFeignClients( basePackages = "com.consumer.interfaces")
public class ProjectConfig {

    @Bean
    public RestTemplate restTemplate() { // For rest template method
        return new RestTemplate();
    }
}
