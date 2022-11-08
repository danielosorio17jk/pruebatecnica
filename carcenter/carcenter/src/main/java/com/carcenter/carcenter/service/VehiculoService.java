package com.carcenter.carcenter.service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carcenter.carcenter.model.Vehiculo;
import com.carcenter.carcenter.repositories.IVehiculoRepo;


//Notación para indicar que es un servicio
@Service
//Asegura que toda la data requerida este segura hasta que la transacción termine
@Transactional
public class VehiculoService {
	
	static final Logger LOGGER = Logger.getLogger(VehiculoService.class);

	// Inyección de dependecias (crea una instancia cuando lo requiera)
	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	
	public Vehiculo save(Vehiculo vehiculo){
		return iVehiculoRepo.save(vehiculo);
	}
	
	public Optional<Vehiculo> findById(String id){
		return iVehiculoRepo.findById(id);
	}
	
	
	
}
