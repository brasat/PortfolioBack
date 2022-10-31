/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.Controller;

import com.example.Springboott.model.Archivement;
import com.example.Springboott.service.IArchivementService;
 
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
//@RestController
public class ArchivementController {
    
      @Autowired
    private IArchivementService archiveServ;
    
    @GetMapping("/archive/ver/{id}")
    @ResponseBody
    public Archivement ver_archive(@PathVariable Long id){
        return  archiveServ.buscarArchive(id);
    }

 
    @PostMapping("/archive/agregar")
    public Archivement agregar_archive(@RequestBody Archivement scho){
        return archiveServ.agregarArchive(scho);
    } 
    
}
