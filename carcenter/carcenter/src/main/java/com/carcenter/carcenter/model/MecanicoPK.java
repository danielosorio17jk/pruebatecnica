package com.carcenter.carcenter.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//Esta notacion nos serve para integrar una instancia a una clase o entidad 
@Embeddable
public class MecanicoPK implements Serializable{
	
	//Definimos un identificador unico para cada clase 
	private static final long serialVersionUID =1l;

	//@Id
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "TIPO_DOCUMENTO", length = 2 , nullable = false)
	private String tipoDocumento;
	
	//@Id
	//etiqueta que nos permite decir el nombre de la culumna, el tamaño permitido y si puede ser nuleable 
	@Column(name = "DOCUMENTO", nullable = false)
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

	//permite recuperar el Hash Code asignado
	@Override
	public int hashCode() {
		return Objects.hash(documento, tipoDocumento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MecanicoPK other = (MecanicoPK) obj;
		return documento == other.documento && Objects.equals(tipoDocumento, other.tipoDocumento);
	}

		
}
