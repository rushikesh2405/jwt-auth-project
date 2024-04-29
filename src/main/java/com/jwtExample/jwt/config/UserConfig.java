package com.jwtExample.jwt.config;

import com.jwtExample.jwt.model.JwtRequest;
import com.jwtExample.jwt.model.JwtResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class UserConfig {

    @Bean
    public UserDetailsService userDetailsService(){
         UserDetails user1 = User.builder().username("rushikesh").password(passwordEncoder().encode("abc")).roles("ADMIN").build();
         UserDetails user2 = User.builder().username("khushboo").password(passwordEncoder().encode("love")).roles("WIFE").build();
        UserDetails user3 = User.builder().username("kittu").password(passwordEncoder().encode("sister")).roles("SISTER").build();
        UserDetails user4 = User.builder().username("saurabh").password(passwordEncoder().encode("brother")).roles("BROTHER").build();

        return new InMemoryUserDetailsManager(user1,user2,user3,user4);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }

}
