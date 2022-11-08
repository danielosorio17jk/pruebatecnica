package com.carcenter.carcenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carcenter.carcenter.model.Repuesto;

//Notación para indicar que es un repositorio
//extends jpaRepository para obtener metodos principales de select, crear, update, delete
@Repository
public interface IRepuestoRepo extends JpaRepository<Repuesto, Integer>{

}
