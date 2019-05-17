package com.job.interview.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.job.interview.petclinic.entity.Veterinaria;
import com.job.interview.petclinic.exceptions.NotExistException;
import com.job.interview.petclinic.repository.VeterinariaRepository;

@Service
public class VeterinariaService {
	
	@Autowired
	VeterinariaRepository vetRepo;
	
	public Page<Veterinaria> getVeterinarias(Pageable page){
		return vetRepo.findAll(page);
	}
	
	public Veterinaria getById(Long id) {
		return vetRepo.findById(id).orElseThrow(() -> new NotExistException("No existe el recurso"));
	}
	
	public void saveVeterinaria(Veterinaria veterinaria) {
		vetRepo.save(veterinaria);
	}

}
