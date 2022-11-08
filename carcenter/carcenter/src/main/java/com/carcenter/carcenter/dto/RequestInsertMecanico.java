package com.carcenter.carcenter.dto;

import javax.validation.constraints.NotBlank;

public class RequestInsertMecanico {

	// Notación para especificar que el campo no puede venir vacio
	@NotBlank
	private String tipoDocumento;

	// Notación para especificar que el campo no puede venir vacio
	@NotBlank
	private int documento;

	// Notación para especificar que el campo no puede venir vacio
	@NotBlank
	private String primerNombre;

	private String segundoNombre;

	// Notación para especificar que el campo no puede venir vacio
	@NotBlank
	private String primerApellido;

	private String segundoApellido;

	// Notación para especificar que el campo no puede venir vacio
	@NotBlank
	private String celular;

	// Notación para especificar que el campo no puede venir vacio
	@NotBlank
	private String direccion;

	// Notación para especificar que el campo no puede venir vacio
	@NotBlank
	private String email;

	private char estado;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	

}
