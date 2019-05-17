package com.job.interview.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.job.interview.petclinic.dto.ClienteDTO;
import com.job.interview.petclinic.exceptions.NotExistException;
import com.job.interview.petclinic.service.ClienteService;

@RestController
@RequestMapping(value = "/api/v1/clientes", produces = "application/json")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createCliente(@RequestBody(required = true) ClienteDTO cliente) throws NotExistException{
		clienteService.saveCliente(cliente);
	}

	@RequestMapping(value="", method = RequestMethod.GET)
	public Object clientes(
			@PageableDefault(page = 0, size = 50) Pageable page,
			@RequestParam(required = false) Long vetId,
			@RequestParam(required = false) String nombre) {
		if(vetId != null) {
			return clienteService.getByVet(vetId);
		}else {
			return clienteService.getClientes(page, nombre);
		}
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Object getCliente(@PathVariable() Long id) {
		return clienteService.getById(id);
	}
}
