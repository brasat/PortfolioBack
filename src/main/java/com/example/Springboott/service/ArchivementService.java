/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Archivement;
import com.example.Springboott.repository.ArchiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruno
 */

@Service
public class ArchivementService implements IArchivementService {
    
       @Autowired
    private ArchiveRepository archiveRepository;

    public ArchivementService(ArchiveRepository repository) {
    this.archiveRepository = repository;
    }

    @Override
    public Archivement buscarArchive(Long id) {
      return archiveRepository.findById(id).orElse(null);  
    }

    @Override
    public Archivement agregarArchive(Archivement comp) {
       return archiveRepository.save(comp);
    }
 
    
}
