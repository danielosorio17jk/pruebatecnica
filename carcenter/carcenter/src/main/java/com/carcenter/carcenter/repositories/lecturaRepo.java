package com.carcenter.carcenter.repositories;




import org.springframework.data.domain.Page;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.data.domain.Pageable;


@NoRepositoryBean//no sea crea una instancia
/*se crea interface y extiende de reporsitory para evitar encontrar metodos que sean de insercion y/o actualizacion
 * esto quiere decir que solo podemos hacer operaciones de lectura, y por este motivo se crea el repositorio de lectura 
 * 
 */
public interface lecturaRepo<T, ID>  extends Repository<T, ID>{
	Page<T> findAll(Pageable pageable);
}
