/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 *
 * @author Bruno
 */
@Entity
@Table(name = "school")
public class School implements Serializable {

    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id") 
    private Long Id;
    
     private String name;
     private String img;
     private String url;

    public School() {
        
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }


    public School(String name, String img, String url) {
        this.name = name;
        this.img = img;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
     
     
}
