package com.job.interview.petclinic.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.job.interview.petclinic.entity.Mascota;

public interface MascotaRepository extends CrudRepository<Mascota, Long>{
	
	Page<Mascota> findByNombre(Pageable page, String nombre);
	
	Page<Mascota> findAll(Pageable page);

}
