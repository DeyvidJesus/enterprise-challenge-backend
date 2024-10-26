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
                .allowedOrigins("https://enterprise-challenge-frontend.vercel.app") // Removido a barra final
                .allowedHeaders("*")
                .allowedMethods("*") // Permitir todos os métodos (GET, POST, PUT, DELETE, etc.)
                .allowCredentials(true); // Permitir credenciais se necessário
    }
}
