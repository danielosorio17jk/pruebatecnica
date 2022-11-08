package com.carcenter.carcenter.repositories;


import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.carcenter.carcenter.model.Mecanico;

//Notación para indicar que es un repositorio
//extends jpaRepository para obtener metodos principales de select, crear, update, delete
@Repository
public interface IMecanicoRepo extends JpaRepository<Mecanico, Integer> {

	/**
	 * la etiqueta proced
	 * 
	 * @param I_TIPO_DOCUMENTO
	 * @param I_DOCUMENTO
	 * @param I_PRIMER_NOMBRE
	 * @param I_SEGUNDO_NOMBRE
	 * @param I_PRIMER_APELLIDO
	 * @param I_SEGUNDO_APELLIDO
	 * @param I_CELULAR
	 * @param I_DIRECCION
	 * @param I_EMAIL
	 * @param I_ESTADO
	 * @return
	 */
	@Procedure(name = "insert_mecanicos")
	public Map<String, Object> insertMecanico(String I_TIPO_DOCUMENTO, int I_DOCUMENTO, String I_PRIMER_NOMBRE,
			String I_SEGUNDO_NOMBRE, String I_PRIMER_APELLIDO, String I_SEGUNDO_APELLIDO, String I_CELULAR,
			String I_DIRECCION, String I_EMAIL, char I_ESTADO);


}
