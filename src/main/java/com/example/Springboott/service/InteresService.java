/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Interes;
import com.example.Springboott.repository.InteresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruno
 */

@Service
public class InteresService implements IInteresService{
    
    
    @Autowired
    private InteresRepo interesRepository;

    public InteresService(InteresRepo repository) {
    this.interesRepository = repository;
    }

    @Override
    public Interes buscarInteres(Long id) {
      return interesRepository.findById(id).orElse(null);  
    }

    @Override
    public Interes agregarInteres(Interes school) {
       return interesRepository.save(school);
    }
}
