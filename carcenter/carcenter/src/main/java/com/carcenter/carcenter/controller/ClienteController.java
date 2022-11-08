package com.carcenter.carcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carcenter.carcenter.dto.RequestConsultaCliente;
import com.carcenter.carcenter.dto.RequestRegistrarCliente;
import com.carcenter.carcenter.model.Cliente;
import com.carcenter.carcenter.model.ClientePk;
import com.carcenter.carcenter.service.ClienteService;

//Notación para indicar que es un controlador de tipo Rest
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	// Inyección de dependencias
	@Autowired
	private ClienteService clienteService;

	// Se le indica el tipo de petición asi como el nombre del servicio
	@GetMapping("/consultar")
	public List<Cliente> inserMecanico(@RequestBody RequestConsultaCliente insert) throws Exception {
		return clienteService.consulta(insert);
	}

	@PostMapping("/registrar")
	public Cliente registrar(@RequestBody RequestRegistrarCliente cliente) throws Exception {
		Cliente clienteO = new Cliente();
		ClientePk clientePk = new ClientePk();
		
		clientePk.setDocumento(cliente.getDocumento());
		clientePk.setTipoDocumento(cliente.getTipoDocumento());
		clienteO.setCelular(cliente.getCelular());
		clienteO.setDireccion(cliente.getDireccion());
		clienteO.setEmail(cliente.getEmail());
		clienteO.setPk(clientePk);
		clienteO.setPrimerApellido(cliente.getPrimerApellido());
		clienteO.setPrimerNombre(cliente.getPrimerNombre());
		clienteO.setSegundoApellido(cliente.getSegundoApellido());
		clienteO.setSegundoNombre(cliente.getSegundoNombre());

		return clienteService.save(clienteO);
	}
}
