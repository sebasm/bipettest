package com.job.interview.petclinic.dto;

import com.job.interview.petclinic.entity.Cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {
	
	private Long veterinariaId;
	private String nombre;
	private String telefono;
	
	public Cliente getCliente() {
		return new Cliente(nombre, telefono);
	}
	

}
