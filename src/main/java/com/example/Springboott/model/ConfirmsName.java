/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Bruno
 */
public class ConfirmsName {
     @JsonProperty("Cname") 
    private String cname;

    public ConfirmsName() {
    }

    public ConfirmsName(String cname) {
        this.cname = cname;
    }
     
     
}
