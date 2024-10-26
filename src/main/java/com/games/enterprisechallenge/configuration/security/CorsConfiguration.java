package com.games.enterprisechallenge.configuration.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("https://enterprise-challenge-frontend.vercel.app")
            .allowedHeaders("*")
            .allowedMethods("*") // Especificando métodos necessários
            .allowedOriginPatterns("*") // Permite subdomínios
            .allowCredentials(true); // Remover allowCredentials se não for necessário
    }
}
