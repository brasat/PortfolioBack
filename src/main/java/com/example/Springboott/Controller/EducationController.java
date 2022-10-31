/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.Controller;

import com.example.Springboott.model.Education;
import com.example.Springboott.service.IEducationService;
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
public class EducationController {
    
    @Autowired
    private IEducationService eduServ;
    
    @GetMapping("/education/ver/{id}")
    @ResponseBody
    public Education ver_edu(@PathVariable Long id){
        return  eduServ.buscarEdu(id);
    }

    
    @PostMapping("/education/agregar")
    public Education agregar_edu(@RequestBody Education scho){
        return eduServ.agregarEdu(scho);
    }
    
}
