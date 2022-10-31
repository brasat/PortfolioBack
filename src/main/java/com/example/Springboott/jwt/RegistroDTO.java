/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.jwt;

/**
 *
 * @author Bruno
 */
public class RegistroDTO {
        private String nombre;
        private String apellido;
	private String username;
	private String email;
	private String password;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}
        
        public void setApellido(String nombre) {
		this.apellido = nombre;
	}

	public String getApellido() {
		return apellido;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}  

	public void setPassword(String password) {
		this.password = password;
	}

	public RegistroDTO() {
		super();
	}
}
