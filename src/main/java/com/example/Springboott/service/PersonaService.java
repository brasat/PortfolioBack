/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.service;


import com.example.Springboott.model.Persona;
import com.example.Springboott.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruno
 */
@Service
public class PersonaService implements IPersonaService{

 
          @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(PersonaRepository repository) {
    this.personaRepository = repository;
    }

    @Override
    public Persona buscarPersona(String Email) {
      return personaRepository.findByEmail(Email).orElse(null);  
    }


   @Override
       public Persona agregarPersona(Persona savedCustomer) {
        Persona customer =    personaRepository.findByEmail(savedCustomer.getEmail()).orElse(null);
        
        if(customer != null) {
            customer.setNombre(savedCustomer.getNombre());
            customer.setApellido(savedCustomer.getApellido());
            customer.setAbout(savedCustomer.getAbout());
            customer.setBackImage(savedCustomer.getBackImage());
            customer.setImage(savedCustomer.getImage());
            customer.setPosition(savedCustomer.getPosition());
            customer.setTelefono(savedCustomer.getTelefono());
            customer.setCorreo(savedCustomer.getCorreo());
             customer.setUbication(savedCustomer.getUbication());
             customer.setAptitudes(savedCustomer.getAptitudes());
             
 
        } else {
            customer = new Persona();
            customer.setNombre(savedCustomer.getNombre());
            customer.setApellido(savedCustomer.getApellido());
            customer.setEmail(savedCustomer.getEmail());
            customer.setAbout(savedCustomer.getAbout());
        }
        return personaRepository.save(customer);
    }

 
     

    
}
