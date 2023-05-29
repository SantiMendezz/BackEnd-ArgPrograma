/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.util.*;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 *
 * @author HP
 */
public class TokenUtils {
    private final static String ACCESS_TOKEN_SECRET = "ePzW83mDG@U0q&gX%6hnJf*B#4K-v$L1S!tA7Ry+O#x2Y&z9N^8T5G6J7H";
    private final static Long ACCESS_TOKEN_VALIDITY_SECONDS = 2_592_000L;
    
    public static String createToken(String nombre, String email) {
        Long expirationTime = ACCESS_TOKEN_VALIDITY_SECONDS + 1_000;
        Date expirationDate = new Date(System.currentTimeMillis() + expirationTime);
        
        Map<String,Object> extra = new HashMap<>();
        extra.put("nombre",nombre);
        
        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes()))
                .compact();
    }
    
    public static UsernamePasswordAuthenticationToken getAuthentication(String token) {
        try{
            Claims claims = Jwts.parserBuilder()
                .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody();
        
        String email = claims.getSubject();
        
        return new UsernamePasswordAuthenticationToken(email,null,Collections.emptyList());
        } catch (JwtException e) {
            return null;
        }
        
    }
}
