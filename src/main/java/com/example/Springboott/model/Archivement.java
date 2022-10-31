/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.model;


import javax.persistence.Entity;
import javax.persistence.Id;
 

/**
 *
 * @author Bruno
 */

 
 @Entity
public class Archivement {
    public Archivement() {
    }

    public Archivement(String name) {
    }
       
    
    @Id
    private int Id;



 
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
 
    private String name;
     
 
    private String progress;
      
   
    private String confirms;
     
 
    private String confirmsNames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getConfirms() {
        return confirms;
    }

    public void setConfirms(String confirms) {
        this.confirms = confirms;
    }

    public String getConfirmsNames() {
        return confirmsNames;
    }

    public void setConfirmsNames(String confirmsNames) {
        this.confirmsNames = confirmsNames;
    }
    
    
    
}
