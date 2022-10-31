/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.repository;


import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springboott.model.Persona;

/**
 *
 * @author Bruno
 */

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{

    
	public Optional<Persona> findByEmail(String email);
	
	public Optional<Persona> findByUsernameOrEmail(String username,String email);
	
	public Optional<Persona> findByUsername(String username);
        
        public Optional<Persona> findById(Long id);
	
	public Boolean existsByUsername(String username);
	
	public Boolean existsByEmail(String email);
  
}
