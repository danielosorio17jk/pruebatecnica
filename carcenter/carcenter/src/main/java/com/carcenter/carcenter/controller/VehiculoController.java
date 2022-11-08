package com.carcenter.carcenter.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carcenter.carcenter.dto.RequestRegistrarVehiculo;
import com.carcenter.carcenter.model.Cliente;
import com.carcenter.carcenter.model.ClientePk;
import com.carcenter.carcenter.model.Marca;
import com.carcenter.carcenter.model.Vehiculo;
import com.carcenter.carcenter.service.VehiculoService;

//Notación para indicar que es un controlador de tipo Rest
@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {
	
	@Autowired
	private VehiculoService vehiculoService;
	
	@GetMapping("/consultar")
	public Optional<Vehiculo>  consultarVehiculo (@RequestParam String placa) {
		return vehiculoService.findById(placa);
	}
	
	@PostMapping("/registrar")
	public Vehiculo registarVehiculo(RequestRegistrarVehiculo request)throws Exception {
		Vehiculo vehiculo = new Vehiculo();
		Cliente cliente = new Cliente();
		ClientePk clientePk = new ClientePk();
		Marca marca = new Marca();
		
		clientePk.setDocumento(request.getDocumento());
		clientePk.setTipoDocumento(request.getTipoDocumento());
		cliente.setPk(clientePk);
		marca.setCodigo(request.getCodMarca());
		vehiculo.setPlaca(request.getPlaca());
		vehiculo.setMarca(marca);
		vehiculo.setColor(request.getColor());
		vehiculo.setCliente(cliente);
		
		return vehiculoService.save(vehiculo);
	}

}
