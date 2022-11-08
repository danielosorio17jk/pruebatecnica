package com.carcenter.carcenter.service;



import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.carcenter.carcenter.model.VPrioridadMecanico;
import com.carcenter.carcenter.repositories.IVPrioridadMecanicoRepo;

//Notación para indicar que es un servicio
@Service
//Asegura que toda la data requerida este segura hasta que la transacción termine
@Transactional
public class VPrioridadMecanicoService {
	
	static final Logger LOGGER = Logger.getLogger(VPrioridadMecanicoService.class);

	// Inyección de dependecias (crea una instancia cuando lo requiera)
	// el atributo requerido en falso indica que la propiedad no es necesaria para la conexión automática y la propiedad se ignora si no se puede conectar automáticamente.
	@Autowired
	private IVPrioridadMecanicoRepo ivPrioridadMecanicoRepo;
	
	public Page<VPrioridadMecanico> listarMecanicosPrio(Pageable pageable){
		return  ivPrioridadMecanicoRepo.findAll(pageable);
	}

	//public Page<VPrioridadMecanico> listarMecanicosPrioDos(Pageable pageable){
	//	return ivPrioridadMecanicoRepo.g(pageable);
	//}
}
