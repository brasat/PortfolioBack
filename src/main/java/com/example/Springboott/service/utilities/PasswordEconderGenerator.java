/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.service.utilities;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Bruno
 */
public class PasswordEconderGenerator {
	public static void main(String[] args) {

		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();		
                System.out.println(passwordEncoder.encode("password"));
	}
}
