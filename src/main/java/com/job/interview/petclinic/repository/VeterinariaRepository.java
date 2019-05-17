package com.job.interview.petclinic.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.job.interview.petclinic.entity.Veterinaria;

@Repository
public interface VeterinariaRepository extends CrudRepository<Veterinaria, Long>{
	
	Page<Veterinaria> findAll(Pageable page);
	

}
