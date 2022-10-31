/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Interes;

/**
 *
 * @author Bruno
 */
public interface IInteresService {
    
      public Interes buscarInteres(Long id);
    public Interes agregarInteres(Interes scho);
    
}
