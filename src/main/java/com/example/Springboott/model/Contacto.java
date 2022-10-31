/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 *
 * @author Bruno
 */
@Entity
@Table(name = "Contacto")
public class Contacto implements Serializable {
    
     @Id
     private Long id;

   @OneToOne
    private Persona persona;
    
    @JsonProperty("Telefono") 
    private String telefono;
    private String correo;

    public Contacto() {
    }

    public Contacto(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
}
