package com.job.interview.petclinic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.job.interview.petclinic.dto.ClienteDTO;
import com.job.interview.petclinic.entity.Cliente;
import com.job.interview.petclinic.entity.Veterinaria;
import com.job.interview.petclinic.exceptions.NotExistException;
import com.job.interview.petclinic.repository.ClienteRepository;
import com.job.interview.petclinic.repository.VeterinariaRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	VeterinariaRepository veterinariaRepository;

	public void saveCliente(ClienteDTO clienteDTO) throws NotExistException {
		Veterinaria veterinaria = veterinariaRepository.findById(clienteDTO.getVeterinariaId()).orElseThrow(() -> new NotExistException("La veterinaria no existe."));
		veterinaria.getClientes().add(clienteDTO.getCliente());
		veterinariaRepository.save(veterinaria);
	}
	
	public Cliente getById(Long id) {
		return clienteRepository.findById(id).orElseThrow(() -> new NotExistException("No existe el recurso"));
	}

	public Page<Cliente> getClientes(Pageable page, String nombre) {
		if(nombre != null) {
			return clienteRepository.findByNombre(page, nombre);
		}else {
			return clienteRepository.findAll(page);
		}
		
	}

	public List<Cliente> getByVet(Long vetId) {
		List<Cliente> response = new ArrayList<Cliente>();
		Optional<Veterinaria> veterinaria = veterinariaRepository.findById(vetId);
		if(veterinaria.isPresent()) {
			response = veterinaria.get().getClientes();
		}
		return response;
	}

}
