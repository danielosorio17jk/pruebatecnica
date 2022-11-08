package com.carcenter.carcenter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REPUESTOS")
public class Repuesto {
	
	@Id
	@Column(name = "CODIGO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)//el id se genera automaticamente 
	private int codigo;
	
	@Column(name = "NOMBRE_REPUESTO", length = 100)
	private String nombreRepuesto;
	
	@Column(name = "PRECIO_UNITARIO")
	private int precioUnitario;
	
	@Column(name = "UNIDADES_INVENTARIO")
	private int unidadesInventario;
	
	@Column(name = "PROVEDOR", length = 300)
	private String provedor;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreRepuesto() {
		return nombreRepuesto;
	}

	public void setNombreRepuesto(String nombreRepuesto) {
		this.nombreRepuesto = nombreRepuesto;
	}

	public int getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getUnidadesInventario() {
		return unidadesInventario;
	}

	public void setUnidadesInventario(int unidadesInventario) {
		this.unidadesInventario = unidadesInventario;
	}

	public String getProvedor() {
		return provedor;
	}

	public void setProvedor(String provedor) {
		this.provedor = provedor;
	} 

}
