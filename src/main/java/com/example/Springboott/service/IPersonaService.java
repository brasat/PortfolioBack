/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.service;

import java.util.List;

import com.example.Springboott.model.Persona;

/**
 *
 * @author Bruno
 */
public interface IPersonaService {
    
    public Persona buscarPersona(String Email);
    public Persona agregarPersona(Persona pers);

    
    
}
