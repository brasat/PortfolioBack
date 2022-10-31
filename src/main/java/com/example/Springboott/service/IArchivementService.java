/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Archivement;

/**
 *
 * @author Bruno
 */
public interface IArchivementService {
    
 public Archivement buscarArchive(Long id);
    public Archivement agregarArchive(Archivement scho);
    
 
}
