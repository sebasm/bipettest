package com.job.interview.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.job.interview.petclinic.entity.Veterinaria;
import com.job.interview.petclinic.service.VeterinariaService;

@RestController
@RequestMapping(value = "/api/v1/veterinarias", produces = "application/json")
public class VeterinariaController {
	
	@Autowired
	VeterinariaService vetService;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public Page<Veterinaria> veterinarias(Pageable page) {
		Page<Veterinaria> response = vetService.getVeterinarias(page);
		return response;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Veterinaria getVeterinaria(@PathVariable() Long id) {
		return vetService.getById(id);
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createVeterinaria(@RequestBody(required = true) Veterinaria veterinaria){
		vetService.saveVeterinaria(veterinaria);
	}

}
