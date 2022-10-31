/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.Controller;

import com.example.Springboott.model.Experience;
import com.example.Springboott.service.IExperienceService;
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
public class ExperienceController {
    
     @Autowired
    private IExperienceService expServ;
    
    @GetMapping("/experience/ver/{id}")
    @ResponseBody
    public Experience ver_exp(@PathVariable Long id){
        return  expServ.buscarExp(id);
    }

    
    @PostMapping("/experience/agregar")
    public Experience agregar_exp(@RequestBody Experience scho){
        return expServ.agregarExp(scho);
    }
    
}
