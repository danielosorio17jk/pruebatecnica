package com.carcenter.carcenter.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.Immutable;

//Notación para indicar que es una entidad
@Entity
@Immutable//le indica al hibernate que la entidad no cambia y lo excluira de las comprobaciones 
@Table(name = "v_prioridad_mecanicos")
public class VPrioridadMecanico {

	@Id
	@Column(name = "DOCUMENTO")
	private int documento;
	
	@Column(name = "PRIMER_NOMBRE")
	private String primerNombre;
	
	@Column(name = "SEGUNDO_NOMBRE")
	private String segundoNombre;
	
	@Column(name = "PRIMER_APELLIDO")
	private String primerApellido;
	
	@Column(name = "SEGUNDO_APELLIDO")
	private String segundoApellido;
	
	@Column(name = "ESTADO")
	private int estado;
	
	@Column(name = "CANTIDAD")
	private int cantidad;
	
	public VPrioridadMecanico() {
		// TODO Auto-generated constructor stub
	}

	// no se proporciona ningun metodo set para que el hibernate no detecte ningun cambio en la entidad 
	// y lo excluira de las comprobaciones 
	public int getDocumento() {
		return documento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public int getEstado() {
		return estado;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	
	
	
}

