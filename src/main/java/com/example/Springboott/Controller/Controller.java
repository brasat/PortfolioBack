
package com.example.Springboott.Controller;


import com.example.Springboott.model.Persona;
import com.example.Springboott.service.IPersonaService;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping("/ver/{email}")
    @ResponseBody
    public Persona ver_persona(@PathVariable String email){
        Persona aux =  persoServ.buscarPersona(email);
        aux.setPassword(null);
        return aux;
    }

    
    @PostMapping("/agregar")
    public Persona agregar_persona(@RequestBody Persona pers){
        return persoServ.agregarPersona(pers);
    }



    
    
}
