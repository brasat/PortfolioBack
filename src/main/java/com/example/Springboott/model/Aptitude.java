/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/**
 *
 * @author Bruno
 */
@Entity
@Table(name = "aptitudes")
public class Aptitude implements Serializable {
    
    
    
    @Id
    private Long id;

    private ArrayList<String> Aptitudes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<String> getAptitudes() {
        return Aptitudes;
    }

    public void setAptitudes(ArrayList<String> Aptitudes) {
        this.Aptitudes = Aptitudes;
    }
        
        
    
}
