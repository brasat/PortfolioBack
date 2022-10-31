/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Experience;
import com.example.Springboott.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruno
 */

@Service
public class ExperienceService implements IExperienceService {
    
    @Autowired
    private ExperienceRepository expRepository;

    public ExperienceService(ExperienceRepository repository) {
    this.expRepository = repository;
    }

    @Override
    public Experience buscarExp(Long id) {
      return expRepository.findById(id).orElse(null);  
    }

    @Override
    public Experience agregarExp(Experience comp) {
       return expRepository.save(comp);
    }
    
    
}
