//package com.example.ishker_24_statistic.config;
//
//import com.example.ishker_24_statistic.UserDetailsImpl;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Component;
//import io.jsonwebtoken.*;
//import java.util.Date;
//
//@Component
//public class JwtCore {
//    @Value("${testing.app.secret}")
//    private String secret;
//    @Value("${testing.app.lifetime}")
//    private int lifetime;
//
//    public String generateToken(Authentication authentication) {
//        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
//        return Jwts.builder().setSubject((userDetails.getUsername())).setIssuedAt(new Date())
//                .setExpiration(new Date((new Date()).getTime()+lifetime))
//                .signWith(SignatureAlgorithm.HS256,secret)
//                .compact();
//    }
//
//    public String getNameFromJwt(String token) {
//        return Jwts.parser().setSigningKey(secret).parseClaimsJwt(token).getBody().getSubject();
//    }
//}
