package com.sw.thymeleafboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/**").permitAll() // `/board/*Page.do` 패턴 페이지 허용
            )
        .csrf(csrf -> csrf.disable()); // 필요한 경우 CSRF 보호 비활성화
        return http.build();
    }
}
