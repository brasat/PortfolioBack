/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.Education;

/**
 *
 * @author Bruno
 */
public interface IEducationService {
        public Education buscarEdu(Long id);
    public Education agregarEdu(Education scho);
}
