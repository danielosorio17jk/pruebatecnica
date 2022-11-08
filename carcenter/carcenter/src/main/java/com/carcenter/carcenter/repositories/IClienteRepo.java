package com.carcenter.carcenter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.carcenter.carcenter.model.Cliente;



//Notación para indicar que es un repositorio
//extends jpaRepository para obtener metodos principales de select, crear, update, delete
@Repository
public interface IClienteRepo extends JpaRepository<Cliente, String> {

	@Query(value = "select * from clientes where DOCUMENTO=:documento and TIPO_DOCUMENTO=:tipo",
			nativeQuery =  true)
	public List<Cliente> consultar(int documento, String tipo) throws Exception; 

	
	
}
