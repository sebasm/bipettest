package com.job.interview.petclinic.dto;

import com.job.interview.petclinic.entity.Mascota;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MascotaDTO {
	
	private String nombre;
	private Long duenioId;
	
	public Mascota getMascota() {
		return new Mascota(nombre);
	}
	

}
