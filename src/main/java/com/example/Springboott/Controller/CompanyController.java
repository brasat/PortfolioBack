/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.Controller;

import com.example.Springboott.model.Company;
import com.example.Springboott.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bruno
 */

@RestController
public class CompanyController {
    
        
    @Autowired
    private ICompanyService companyServ;
    
    @GetMapping("/company/ver/{id}")
    @ResponseBody
    public Company ver_compania(@PathVariable Long id){
        return  companyServ.buscarCompany(id);
    }

    
    @PostMapping("/company/agregar")
    public Company agregar_compania(@RequestBody Company comp){
        return companyServ.agregarCompany(comp);
    }
    
    
}
