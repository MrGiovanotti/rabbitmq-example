package com.mrgiovanotti.rabbitmq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:custom.properties")
public class PropertiesConfiguration {
    
}
