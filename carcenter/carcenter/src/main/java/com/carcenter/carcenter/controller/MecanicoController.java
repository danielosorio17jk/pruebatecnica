package com.carcenter.carcenter.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carcenter.carcenter.dto.RequestInsertMecanico;
import com.carcenter.carcenter.dto.ResponseGenerico;
import com.carcenter.carcenter.service.MecanicoService;

//Notación para indicar que es un controlador de tipo Rest
@RestController
//Notación para indicar el contexto de nuestros endpoint es decir /torre/nombreServicio
@RequestMapping("/mecanico")
public class MecanicoController {

	//Inyección de dependencias
	@Autowired
	private MecanicoService repo;
	
	 //Se le indica el tipo de petición asi como el nombre del servicio
	@PostMapping("/crearMecanico")
	public ResponseGenerico inserMecanico(@RequestBody RequestInsertMecanico insert) {
		return repo.insertMecanico(insert);
	}

}
