package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
//Esto es para que rest template este construido en el proyecto, si no, no andaría.
//Generamos el contexto

    @Bean
    public RestTemplate restTemplate() {
        return  new RestTemplate();
    }

}
