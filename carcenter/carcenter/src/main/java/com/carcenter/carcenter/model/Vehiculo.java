package com.carcenter.carcenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICULOS")
public class Vehiculo {
	
	@Id
	@Column(name = "PLACA")
	private String placa;
	
	@Column(name ="COLOR",length = 30 )
	private String color;
	
	@ManyToOne
	@JoinColumn(name ="COD_MARCA")
	private Marca marca;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "CLI_DOCUMENTO", referencedColumnName = "DOCUMENTO"),
		@JoinColumn(name = "CLI_TIPO_DOCUMENTO", referencedColumnName = "TIPO_DOCUMENTO")
	})
	private Cliente cliente;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
