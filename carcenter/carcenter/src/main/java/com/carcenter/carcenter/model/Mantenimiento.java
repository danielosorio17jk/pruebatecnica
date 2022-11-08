package com.carcenter.carcenter.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "MANTENIMIENTOS")
public class Mantenimiento {

	@Id
	@Column(name = "CODIGO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)//el id se genera automaticamente 
	private int codigo;
	
	@Column(name = "ESTADO")
	private int estado;
	
	@ManyToOne
	@JoinColumn(name = "COD_PLACA")
	private Vehiculo vehiculo; //fk
	
	@Column(name = "FECHA")
	private Date fecha;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "MEC_DOCUMENTO", referencedColumnName = "DOCUMENTO"),
		@JoinColumn(name = "MEC_TIPO_DOCUMENTO", referencedColumnName = "TIPO_DOCUMENTO")
	})
	private Mecanico mecanico;


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}
	

}
