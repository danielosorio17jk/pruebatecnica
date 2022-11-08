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
@Table(name = "REPUESTOS_X_MANTENIMIENTOS")
public class RepuestosXMantenimiento {

	@Id
	@Column(name = "CODIGO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)//el id se genera automaticamente 
	private int codigo;
	
	@Column(name = "UNIDADES")
	private int unidades;
	
	@Column(name = "TIEMPO_ESTIMADO")
	private int tiempoEstimado;
	
	@ManyToOne
	@JoinColumn(name = "COD_MANTENIMIENTO")
	private Mantenimiento mantenimiento;//fk
	
	@ManyToOne //de muchos a uno 
	@JoinColumn(name = "COD_REPUESTO")// nombre de la clumna de la tabla repuestos 
	private Repuesto repuesto;//fk

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public int getTiempoEstimado() {
		return tiempoEstimado;
	}

	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	public Mantenimiento getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public Repuesto getRepuesto() {
		return repuesto;
	}

	public void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}
	
	
}
