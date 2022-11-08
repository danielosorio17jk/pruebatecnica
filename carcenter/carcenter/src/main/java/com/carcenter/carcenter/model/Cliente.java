package com.carcenter.carcenter.model;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
//Notación para indicar que es una entidad
@Entity
//Tabla que corresponde a esta entidad
@Table(name = "CLIENTES")
public class Cliente {
	
	//iqueta para llaves compuestas de una tabla / o propiedades que se pueden integrar 
	@EmbeddedId
	private ClientePk pk;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "PRIMER_NOMBRE", length = 30)
	private String primerNombre;
	
	@Column(name = "SEGUNDO_NOMBRE", length =  30)
	private String segundoNombre;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "PRIMER_APELLIDO", length = 30)
	private String primerApellido;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "SEGUNDO_APELLIDO", length = 30)
	private String segundoApellido;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "CELULAR", length = 10)
	private String celular;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "DIRECCION", length = 200)
	private String direccion;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "EMAIL", length = 100)
	private String email;
	
	public ClientePk getPk() {
		return pk;
	}

	public void setPk(ClientePk pk) {
		this.pk = pk;
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
	
}
