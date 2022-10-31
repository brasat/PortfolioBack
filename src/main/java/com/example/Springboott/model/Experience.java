/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Bruno
 */

@Entity
@Table(name = "experience")
public class Experience {
        
          
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id") 
    private Long Id;
        
        
     private String position;
    private String company;
    private String img;
    private String mode;
    private String start;
    private String end;
    private String time;
    private String ubicacion;

    public Experience() {
    }

    public Experience(String position, String company, String img, String mode, String start, String end, String time, String ubicacion) {
        this.position = position;
        this.company = company;
        this.img = img;
        this.mode = mode;
        this.start = start;
        this.end = end;
        this.time = time;
        this.ubicacion = ubicacion;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
}
