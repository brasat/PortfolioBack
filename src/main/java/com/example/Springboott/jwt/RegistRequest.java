/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.jwt;

/**
 *
 * @author Bruno
 */
public class RegistRequest {
    
    private String email;
    private String status;

    public RegistRequest(String email, String status) {
        this.email = email;
        this.status = status;
    }

 
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
