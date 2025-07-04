package com.serie.spring_boot_kotlin_crud_with_ci_cd.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeHttpRequests {
                it.requestMatchers(
                    "/v3/api-docs/**",    // Allow access to OpenAPI docs
                    "/swagger-ui/**",     // Allow access to Swagger UI
                    "/swagger-ui.html" ,
                    "/api/v1/users",
                    "/products",
                    "/products/**",
                    "/",
                    "/docs"
                ).permitAll()
                it.anyRequest().authenticated() // Secure other endpoints
            }
            .csrf { it.disable() }  // Disable CSRF for APIs
        return http.build()
    }


}