/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.jwt;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 *
 * @author Bruno
 */
@Component
public class JwtTokerProvider {
	
	@Value("secret-key")
	private String jwtSecret;
	

	
	public String generarToken(Authentication authentication) {
		String username = authentication.getName();
		
		String token = Jwts.builder().setSubject(username).setIssuedAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
				.signWith(SignatureAlgorithm.HS512, jwtSecret).compact();
		
		return token;
	}
	
	public String obtenerUsernameDelJWT(String token) {
		Claims claims = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
		return claims.getSubject();
	}
	
	public boolean validarToken(String token) {
		try {
			Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
			return true;
		}catch (SignatureException ex) {
			throw null;
		}
		catch (MalformedJwtException ex) {
			throw null;
		}
		catch (ExpiredJwtException ex) {
			throw null;
		}
		catch (UnsupportedJwtException ex) {
			throw null;
		}
		catch (IllegalArgumentException ex) {
			throw null;
		}
	}
}
