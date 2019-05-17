package com.job.interview.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.job.interview.petclinic.dto.MascotaDTO;
import com.job.interview.petclinic.exceptions.NotExistException;
import com.job.interview.petclinic.service.MascotaService;

@RestController
@RequestMapping(value = "/api/v1/mascotas", produces = "application/json")
public class MascotaController {
	
	@Autowired
	MascotaService mascotaService;
	
	@RequestMapping(value="", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createMascota(@RequestBody(required = true) MascotaDTO mascota) throws NotExistException{
		mascotaService.saveMascota(mascota);
	}
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public Object mascotas(
			@PageableDefault(page = 0, size = 50) Pageable page,
			@RequestParam(required = false) Long clientId,
			@RequestParam(required = false) String nombre) {
		if(clientId != null) {
			return mascotaService.getByClient(clientId);
		}else {
			return mascotaService.getMascotas(page, nombre);
		}
	}

}
