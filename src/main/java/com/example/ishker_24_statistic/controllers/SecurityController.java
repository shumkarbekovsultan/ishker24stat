//package com.example.ishker_24_statistic.controllers;
//
//import com.example.ishker_24_statistic.JwtCore;
//import com.example.ishker_24_statistic.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/auth")
//public class SecurityController {
//    private UserRepository userRepository;
//    private PasswordEncoder passwordEncoder;
//    private AuthenticationManager authenticationManager;
//    private JwtCore jwtCore;
//
//    @Autowired
//    public void setUserRepository(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//    @Autowired
//    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//    @Autowired
//    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//    @Autowired
//    public void setJwtCore(JwtCore jwtCore) {
//        this.jwtCore = jwtCore;
//    }
//    //@PostMapping("/signin")
//
//}
