/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Education;
import com.example.Springboott.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruno
 */

@Service
public class EducationService  implements IEducationService {
    
     @Autowired
    private EducationRepository eduRepository;

    public EducationService(EducationRepository repository) {
    this.eduRepository = repository;
    }

    @Override
    public Education buscarEdu(Long id) {
      return eduRepository.findById(id).orElse(null);  
    }

    @Override
    public Education agregarEdu(Education comp) {
       return eduRepository.save(comp);
    }
    
}
