package com.carcenter.carcenter.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//Esta notacion nos serve para integrar una instancia a una clase o entidad 
@Embeddable
public class ClientePk implements Serializable {
	
	//Definimos un identificador unico para cada clase 
	private static final long serialVersionUID =1l;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "TIPO_DOCUMENTO", length = 2)
	private String tipoDocumento;
	
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "DOCUMENTO")
	private int documento;
	
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


}
