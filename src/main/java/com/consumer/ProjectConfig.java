package com.consumer;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients( basePackages = "com.consumer.interfaces")
public class ProjectConfig {
}
