package com.job.interview.petclinic.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "nombre", length=150)
	private String nombre;
	
	@Column(name = "telefono", length=16)
	private String telefono;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Mascota> mascotas;

	
}
