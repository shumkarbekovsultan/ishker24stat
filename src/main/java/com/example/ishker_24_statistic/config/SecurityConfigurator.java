//package com.example.ishker_24_statistic.config;
//
//import com.example.ishker_24_statistic.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.ProviderManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.access.AccessDeniedHandler;
//import org.springframework.security.web.authentication.HttpStatusEntryPoint;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.web.cors.CorsConfiguration;
//import com.example.ishker_24_statistic.config.TokenFilter;
//import java.io.IOException;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfigurator  {
//    private UserService userService;
//
//    public  SecurityConfigurator(){}
//
//    @Autowired
//    public void setTokenFilter(com.example.ishker_24_statistic.TolenFilter tokenFilter) {
//        this.tokenFilter = tokenFilter;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//
//    @Bean
//    public AuthenticationManagerBuilder configureAuthenticationManagerBuilder(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        authenticationManagerBuilder.userDetailsService(userService).passwordEncoder(passwordEncoder());
//        return authenticationManagerBuilder;
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http, TokenFilter tokenFilter) throws Exception {
//        http
//                .csrf(AbstractHttpConfigurer::disable)
//                .cors(httpSecurityCorsConfigurer ->
//                        httpSecurityCorsConfigurer.configurationSource(request ->
//                               new CorsConfiguration().applyPermitDefaultValues() )
//                )
//                .exceptionHandling(exceptions -> exceptions
//                        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
//                        )
//                        .sessionManagement(session -> session
//                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                        )
//                        .authorizeHttpRequests(authorize -> authorize
//                                .requestMatchers("/auth/**").permitAll()
//                                .requestMatchers("/secured/user").fullyAuthenticated()
//                                .anyRequest().permitAll()
//                )
//                .addFilterBefore(tokenFilter, UsernamePasswordAuthenticationFilter.class);
//    return http.build();
//    }
//}
