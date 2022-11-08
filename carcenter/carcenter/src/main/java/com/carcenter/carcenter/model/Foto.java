package com.carcenter.carcenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOTOS")
public class Foto {
	
	@Id
	@Column(name = "CODIGO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)//el id se genera automaticamente 
	private int codigo;
	
	@Column(name = "RUTA", length = 200)
	private String ruta;
	
	@Column(name = "COD_MANTENIMIENTO")
	private int codMantenimiento;//FK

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public int getCodMantenimiento() {
		return codMantenimiento;
	}

	public void setCodMantenimiento(int codMantenimiento) {
		this.codMantenimiento = codMantenimiento;
	}
	

}
