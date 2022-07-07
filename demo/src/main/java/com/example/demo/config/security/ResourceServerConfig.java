package com.example.demo.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@SuppressWarnings("java:S1874")
public class ResourceServerConfig {

	public void configure(HttpSecurity http) throws Exception {
		http
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				.cors().and()
				.csrf().disable()
				.authorizeRequests()
				.antMatchers(
						"/test/findAll"
				).permitAll()
				.anyRequest().authenticated();
	}
}
