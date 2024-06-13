//package com.example.ishker_24_statistic.controllers;
//
//import com.example.ishker_24_statistic.config.JwtCore;
//import com.example.ishker_24_statistic.repository.UserRepository;
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//
//
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
////
//    @Autowired
//    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Autowired
//    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//
//    @Autowired
//    public void setJwtCore(JwtCore jwtCore) {
//        this.jwtCore = jwtCore;
//    }
//
//    @PostMapping("/signin")
//    ResponseEntity<?> signin(@RequestBody SigninRequest SigninRequest) {
//        Authentication authentication = null;
//        try {
//            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signinRequest.getUsername(), signinRequest.getPassword()));
//        } catch (BadCredentialsException e) {
//            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        }
//
//        return null;
//    }
//}