package com.danca.U4Dance.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.danca.U4Dance.security.service.MinhaUsuarioDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    // Dentro de WebSecurityConfig
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
            // .requiresChannel(channel -> channel.anyRequest().requiresSecure())
            .csrf().disable() // Necessário para permitir acesso ao POST
            .httpBasic(Customizer.withDefaults())
            .authorizeHttpRequests(
                authorize -> authorize
                                    .requestMatchers(HttpMethod.POST, "/companhia").authenticated()
                                    .requestMatchers(HttpMethod.POST, "/dancarinos").authenticated()
                                    .requestMatchers(HttpMethod.POST, "/eventos").authenticated()
                                    .requestMatchers(HttpMethod.POST, "/organizadores").authenticated()
                                      ) 
            .authorizeHttpRequests(
                authorize -> authorize.requestMatchers(HttpMethod.DELETE, "/companhia/{id}").authenticated() //Companhia
                                      .requestMatchers(HttpMethod.GET, "/companhia").authenticated()

                                      .requestMatchers(HttpMethod.GET, "/dancarinos").authenticated() //Dancarinos
                                      .requestMatchers(HttpMethod.DELETE, "/dancarinos/{id}").authenticated()

                                      .requestMatchers(HttpMethod.GET, "/eventos").authenticated() //Eventos
                                      .requestMatchers(HttpMethod.DELETE, "/eventos/{id}").authenticated()

                                      .requestMatchers(HttpMethod.GET, "/organizadores").authenticated() //Organizador
                                      .requestMatchers(HttpMethod.DELETE, "/organizadores/{id}").authenticated()
                                      .requestMatchers(HttpMethod.POST, "/criar").authenticated()
                                    );

        return http.build();
    }

    // Dentro de WebSecurityConfig
    @Bean
    public UserDetailsService userDetailsService() {
        //  UserDetails user = User.withDefaultPasswordEncoder()
        //      .username("connectdengue")
        //      .password("connectdengue")
        //      .build();

        //  return new InMemoryUserDetailsManager(user);
         return new MinhaUsuarioDetailsService();
     }

     @Bean
    // Obrigatório. Vai permitir criptografar as senhas das credenciais de login
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
