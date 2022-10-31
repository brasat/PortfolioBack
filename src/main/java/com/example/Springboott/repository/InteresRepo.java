/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.repository;

import com.example.Springboott.model.Interes;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */
@Repository
public interface InteresRepo extends JpaRepository <Interes, Long>{
    
     public Optional<Interes> findById(Long id);
    
}
