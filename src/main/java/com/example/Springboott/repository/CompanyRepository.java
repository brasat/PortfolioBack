/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.repository;

import com.example.Springboott.model.Company;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bruno
 */
@Repository
public interface CompanyRepository extends JpaRepository <Company, Long> {
    
      public Optional<Company> findById(Long id);
    
}
