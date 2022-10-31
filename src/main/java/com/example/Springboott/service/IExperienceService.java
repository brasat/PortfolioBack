/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Experience;

/**
 *
 * @author Bruno
 */
public interface IExperienceService {
    
    public Experience buscarExp(Long id);
    public Experience agregarExp(Experience scho);
    
    
}
