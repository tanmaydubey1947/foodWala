/*
 * package com.restaurant.foodWala.security;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder;
 * 
 * @SuppressWarnings("deprecation")
 * 
 * @Configuration public class SecurityConfigurations extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * auth.inMemoryAuthentication().withUser("USER").password("password").roles(
 * "ADMIN"); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.csrf().disable(); http.headers().frameOptions().disable();
 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
 * }
 * 
 * @Bean public static NoOpPasswordEncoder passwordEncoder() { return
 * (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance(); } }
 */