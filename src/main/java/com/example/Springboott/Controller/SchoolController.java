/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.Controller;

import com.example.Springboott.model.School;
import com.example.Springboott.service.ISchoolService;
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
public class SchoolController {
    
    @Autowired
    private ISchoolService schoolServ;
    
    @GetMapping("/school/ver/{id}")
    @ResponseBody
    public School ver_school(@PathVariable Long id){
        return  schoolServ.buscarSchool(id);
    }

    
    @PostMapping("/school/agregar")
    public School agregar_school(@RequestBody School scho){
        return schoolServ.agregarSchool(scho);
    }

    
    
}
