/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.repository;

import com.example.Springboott.model.Experience;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */

@Repository
public interface ExperienceRepository extends JpaRepository <Experience,Long>{
    
      public Optional<Experience> findById(Long id);
    
}
