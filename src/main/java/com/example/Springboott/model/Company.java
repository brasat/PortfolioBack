 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Bruno
 */
@Entity
@Table(name = "Compania")
public class Company implements Serializable {
    

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


 
    private String name;
    private String img;
    private String url;

    public Company() {
        
        
    }

    public Company(String name, String img, String url) {
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
