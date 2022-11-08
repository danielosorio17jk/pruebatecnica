package com.carcenter.carcenter.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

//Notación para indicar que es una entidad
@Entity
//Tabla que corresponde a esta entidad
@Table(name = "MECANICOS")
//Notación  que se utiliza para un procedimiento almacenada
@NamedStoredProcedureQuery(name = "insert_mecanicos", //el nombre que se va utilizar en el consumo del repositories
procedureName = "INSERT_MECANICOS",//nombre del procedimiento almacenado en la base de datos 
parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "I_TIPO_DOCUMENTO", type = String.class),//parametro de entrada en el pl
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "I_DOCUMENTO", type = Integer.class),//parametro de entrada en el pl
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "I_PRIMER_NOMBRE", type = String.class),//parametro de entrada en el pl
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "I_SEGUNDO_NOMBRE", type = String.class),//parametro de entrada en el pl
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "I_PRIMER_APELLIDO", type = String.class),//parametro de entrada en el pl
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "I_SEGUNDO_APELLIDO", type = String.class),//parametro de entrada en el pl
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "I_CELULAR", type = String.class),//parametro de entrada en el pl
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "I_DIRECCION", type = String.class),//parametro de entrada en el pl
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "I_EMAIL", type = String.class),//parametro de entrada en el pl
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "I_ESTADO", type = char.class),//parametro de entrada en el pl
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "S_EXITO", type = Integer.class),//parametro de salida en el pl
		@StoredProcedureParameter(mode = ParameterMode.OUT, name = "S_MENSAJE", type = String.class),//parametro de salida en el pl
})
public class Mecanico {
	
	//iqueta para llaves compuestas de una tabla / o propiedades que se pueden integrar 
	@EmbeddedId
	private MecanicoPK id;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "PRIMER_NOMBRE", length = 30, nullable = false)
	private String primerNombre;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "SEGUNDO_NOMBRE", length =  30)
	private String segundoNombre;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "PRIMER_APELLIDO", length = 30, nullable = false)
	private String primerApellido;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "SEGUNDO_APELLIDO", length = 30)
	private String segundoApellido;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "CELULAR", length = 10, nullable = false)
	private String celular;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "DIRECCION", length = 200, nullable = false)
	private String direccion;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "EMAIL", length = 100, nullable = false)
	private String email;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "ESTADO", nullable = false)
	private char estado;
	
	public Mecanico() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Mecanico(MecanicoPK id, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String celular, String direccion, String email, char estado) {
		super();
		this.id = id;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.celular = celular;
		this.direccion = direccion;
		this.email = email;
		this.estado = estado;
	}



	public MecanicoPK getId() {
		return id;
	}

	public void setId(MecanicoPK id) {
		this.id = id;
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

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

}
