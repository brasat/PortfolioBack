package com.example.Springboott.jwt;


import com.example.Springboott.model.Persona;
import com.example.Springboott.model.School;
import com.example.Springboott.repository.PersonaRepository;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bruno
 */

@Service
public class CustomUserDetailsService implements UserDetailsService {

    
        @Autowired
    private PersonaRepository personaRepository;

    public CustomUserDetailsService(PersonaRepository repository) {
    this.personaRepository = repository;
    }
    
    
 

    
	
	@Override
	public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
		Persona usuario = personaRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
				.orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con ese username o email : " + usernameOrEmail));
	
		return new User(usuario.getEmail(), usuario.getPassword(),mapearRoles(usuario.getSchool()));
	}
    
        private Collection<? extends GrantedAuthority> mapearRoles(Set<School> roles){
		return roles.stream().map(rol -> new SimpleGrantedAuthority(rol.getName())).collect(Collectors.toList());
	}
}
