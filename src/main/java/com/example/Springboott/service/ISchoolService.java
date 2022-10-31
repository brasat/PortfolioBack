/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.service;

import com.example.Springboott.model.School;

/**
 *
 * @author Bruno
 */
public interface ISchoolService {
        public School buscarSchool(Long id);
        public School agregarSchool(School scho);
}
