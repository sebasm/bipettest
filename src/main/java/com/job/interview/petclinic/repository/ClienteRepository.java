package com.job.interview.petclinic.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.job.interview.petclinic.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
	Page<Cliente> findAll(Pageable page);
	
	Page<Cliente> findByNombre(Pageable page, String nombre);

}
