/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Aptitude;
import com.example.Springboott.repository.AptitudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruno
 */
@Service
public class AptitudeService implements IAptitudeService{
          @Autowired
    private AptitudeRepository aptitudeRepository;

    public AptitudeService(AptitudeRepository repository) {
    this.aptitudeRepository = repository;
    }

    @Override
    public Aptitude buscarAptitude(Long id) {
      return aptitudeRepository.findById(id).orElse(null);  
    }

    @Override
    public Aptitude agregarAptitude(Aptitude comp) {
       return aptitudeRepository.save(comp);
    }
}
