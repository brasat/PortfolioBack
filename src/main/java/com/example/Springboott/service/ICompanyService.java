/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Company;

/**
 *
 * @author Bruno
 */
public interface ICompanyService {
    
        public Company buscarCompany(Long id);
        public Company agregarCompany(Company comp);
    
}
