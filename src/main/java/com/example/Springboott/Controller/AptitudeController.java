/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.Controller;

import com.example.Springboott.model.Aptitude;
import com.example.Springboott.service.IAptitudeService;
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
public class AptitudeController {
    
    @Autowired
    private IAptitudeService aptitudeServ;
    
    @GetMapping("/aptitude/ver/{id}")
    @ResponseBody
    public Aptitude ver_aptitude(@PathVariable Long id){
        return  aptitudeServ.buscarAptitude(id);
    }

    
    @PostMapping("/aptitude/agregar")
    public Aptitude agregar_aptitude(@RequestBody Aptitude scho){
        return aptitudeServ.agregarAptitude(scho);
    }

    
}
