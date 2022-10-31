/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Springboott.repository;

import com.example.Springboott.model.Aptitude;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */

@Repository
public interface AptitudeRepository extends JpaRepository <Aptitude, Long> {
    public Optional<Aptitude> findById(Long id);
    
}
