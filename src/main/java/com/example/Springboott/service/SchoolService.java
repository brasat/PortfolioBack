/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.School;
import com.example.Springboott.repository.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruno
 */
@Service
public class SchoolService implements ISchoolService{
    
    @Autowired
    private SchoolRepo schoolRepository;

    public SchoolService(SchoolRepo repository) {
    this.schoolRepository = repository;
    }

    @Override
    public School buscarSchool(Long id) {
      return schoolRepository.findById(id).orElse(null);  
    }

    @Override
    public School agregarSchool(School school) {
       return schoolRepository.save(school);
    }
    
}
