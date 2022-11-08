package com.carcenter.carcenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICIOS_X_MANTENIMIENTOS")
public class ServiciosXMantenimiento {

	@Id
	@Column(name = "CODIGO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)//el id se genera automaticamente 
	private int codigo;
	
	@Column(name = "TIEMPO_ESTIMADO")
	private int tiempoEstimado;
	
	@ManyToOne
	@JoinColumn(name = "COD_SERVICIO")
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name = "COD_MANTENIMIENTO")
	private Mantenimiento mantenimiento;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTiempoEstimado() {
		return tiempoEstimado;
	}

	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Mantenimiento getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	
}
