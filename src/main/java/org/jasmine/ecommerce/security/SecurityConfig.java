package org.jasmine.ecommerce.security;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails chiya = User.builder()
                .username("chiya")
                .password("{noop}test11")
                .roles("Employee","Manager")
                .build();
        UserDetails brenda = User.builder()
                .username("brenda")
                .password("{noop}test11")
                .roles("Employee","Manager","Admin")
                .build();
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test11")
                .roles("Employee","Manager")
                .build();
        //spring boot will not use the user/pass from the applicaiton.properties
        return  new InMemoryUserDetailsManager(chiya,brenda,john);

    }
//    public UserDetailsManager userDetailsManager(DataSource dataSource) {
//
//
//        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
//
//        //retrieve a user by username
//        jdbcUserDetailsManager.setUsersByUsernameQuery(
//                "select user_id, pw, active from members where user_id=?"
//        );
//
//        //how to find role
//        jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
//                "select user_id, roles from roles where user_id=?"
//        );
//        return jdbcUserDetailsManager;
//    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(configurer ->
//                configurer
//                        .requestMatchers(HttpMethod.GET,"/api/sales").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.GET,"/api/sales/**").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.POST,"/api/sales").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.PUT,"/api/sales").hasRole("MANAGER")
//                        .requestMatchers(HttpMethod.DELETE,"/api/sales/**").hasRole("ADMIN")
//                );
//
//                        http.httpBasic();
//
//                //disable CSRF(Cross Site Request Forgery)
//                //not required for stateless REST APIs that use post
//        http.csrf().disable();
//
//        return http.build();
//
//    }

}
