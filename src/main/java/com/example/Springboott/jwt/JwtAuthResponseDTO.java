/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Springboott.jwt;

/**
 *
 * @author Bruno
 */
public class JwtAuthResponseDTO {
    	private String tokenDeAcceso;
	private String tipoDeToken = "Bearer";

	public JwtAuthResponseDTO (String tokenDeAcceso) {
		super();
		this.tokenDeAcceso = tokenDeAcceso;
	}

	public JwtAuthResponseDTO(String tokenDeAcceso, String tipoDeToken) {
		super();
		this.tokenDeAcceso = tokenDeAcceso;
		this.tipoDeToken = tipoDeToken;
	}

	public String getTokenDeAcceso() {
		return tokenDeAcceso;
	}

	public void setTokenDeAcceso(String tokenDeAcceso) {
		this.tokenDeAcceso = tokenDeAcceso;
	}

	public String getTipoDeToken() {
		return tipoDeToken;
	}

	public void setTipoDeToken(String tipoDeToken) {
		this.tipoDeToken = tipoDeToken;
	}
}
