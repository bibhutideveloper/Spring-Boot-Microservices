package com.bibhuti.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {

	@Bean
	SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		
		System.out.println("Security filter called");

        http.authorizeHttpRequests((req) ->
                req.requestMatchers("/contact")
                        .permitAll()
                        .anyRequest()
                        .authenticated()
        ).formLogin(withDefaults()); 
		
		return http.build();
		
	}

}
