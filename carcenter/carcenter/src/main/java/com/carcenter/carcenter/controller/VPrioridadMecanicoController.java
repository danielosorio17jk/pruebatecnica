package com.carcenter.carcenter.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carcenter.carcenter.model.VPrioridadMecanico;
import com.carcenter.carcenter.service.VPrioridadMecanicoService;

//Notación para indicar que es un controlador de tipo Rest
@RestController
//Notación para indicar el contexto de nuestros endpoint es decir /torre/nombreServicio
@RequestMapping("/listar")
public class VPrioridadMecanicoController {
	

	//Inyección de dependencias
	@Autowired()
	private VPrioridadMecanicoService vPrioridadMecanicoService;
	
	 //Se le indica el tipo de petición asi como el nombre del servicio
	@GetMapping("/prioridad")
	Page<VPrioridadMecanico> listarMecanicosPrio(Pageable pageable){//Pageable nos indica las caracteristicas del paginador
		return vPrioridadMecanicoService.listarMecanicosPrio(pageable);
	}
}
