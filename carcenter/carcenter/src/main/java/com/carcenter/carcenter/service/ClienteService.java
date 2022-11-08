package com.carcenter.carcenter.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carcenter.carcenter.dto.RequestConsultaCliente;
import com.carcenter.carcenter.model.Cliente;
import com.carcenter.carcenter.repositories.IClienteRepo;

@Service
//Asegura que toda la data requerida este segura hasta que la transacción termine
@Transactional
public class ClienteService {
	
	@Autowired
	private IClienteRepo clienteRepo;
	
	public List<Cliente> consulta (RequestConsultaCliente datos) throws Exception {
		return clienteRepo.consultar(datos.getDocumento(), datos.getTipoDocumento());
	}
	
	public Cliente save(Cliente cliente) {
		return clienteRepo.save(cliente);
	}

}
