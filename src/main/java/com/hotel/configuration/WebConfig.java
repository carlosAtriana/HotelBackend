package com.hotel.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Configura CORS para permitir solicitudes desde el dominio de tu frontend desplegado
        registry.addMapping("/**") // Permitir todas las rutas
                .allowedOrigins("https://hotel-la-sierra.netlify.app") // El dominio de tu frontend desplegado
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                .allowedHeaders("*") // Permite todos los encabezados
                .allowCredentials(true); // Permite el envío de cookies o credenciales, si es necesario
    }
}
