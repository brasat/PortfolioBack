/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Aptitude;

/**
 *
 * @author Bruno
 */
public interface IAptitudeService {
    
     public Aptitude buscarAptitude(Long id);
    public Aptitude agregarAptitude(Aptitude scho);
    
}
