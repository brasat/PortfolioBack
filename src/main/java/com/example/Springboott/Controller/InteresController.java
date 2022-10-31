/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.Controller;

import com.example.Springboott.model.Interes;
import com.example.Springboott.service.IInteresService;
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
public class InteresController {
    
    
        @Autowired
    private IInteresService interesServ;
    
    @GetMapping("/Interes/ver/{id}")
    @ResponseBody
    public Interes ver_interes(@PathVariable Long id){
        return  interesServ.buscarInteres(id);
    }

    
    @PostMapping("/interes/agregar")
    public Interes agregar_interes(@RequestBody Interes scho){
        return interesServ.agregarInteres(scho);
    }
    
}
