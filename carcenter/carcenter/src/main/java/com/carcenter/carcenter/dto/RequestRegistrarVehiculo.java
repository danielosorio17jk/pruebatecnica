package com.carcenter.carcenter.dto;

public class RequestRegistrarVehiculo {
	
	private String placa;
	private String color;
	private int documento;
	private String tipoDocumento;
	private int codMarca;
	
	public RequestRegistrarVehiculo() {
		// TODO Auto-generated constructor stub
	}

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

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getCodMarca() {
		return codMarca;
	}

	public void setCodMarca(int codMarca) {
		this.codMarca = codMarca;
	}
	

}
