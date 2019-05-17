package com.job.interview.petclinic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Mascota {
	
	public Mascota() {
		
	}
	
	public Mascota(String nombre) {
		this.nombre = nombre;
	}
	
	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	
//	@ManyToOne
//	@JoinColumn(name = "cliente", nullable = false)
//	private Cliente cliente;

	

}
