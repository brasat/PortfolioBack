/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Company;
import com.example.Springboott.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruno
 */

@Service
public class CompanyService implements ICompanyService {
    
    
        @Autowired
    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository repository) {
    this.companyRepository = repository;
    }

    @Override
    public Company buscarCompany(Long id) {
      return companyRepository.findById(id).orElse(null);  
    }

    @Override
    public Company agregarCompany(Company comp) {
       return companyRepository.save(comp);
    }


    
}
