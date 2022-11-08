package com.carcenter.carcenter.repositories;





import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.carcenter.carcenter.model.VPrioridadMecanico;





//Notación para indicar que es un repositorio
//extends jpaRepository para obtener metodos principales de select, crear, update, delete
@Repository
public interface  IVPrioridadMecanicoRepo extends  lecturaRepo<VPrioridadMecanico, Integer> {

	//Page<VPrioridadMecanico> findAll(PageRequest pageRequest);
	Page<VPrioridadMecanico> findAll(Pageable pageable);

	
	
	

}
