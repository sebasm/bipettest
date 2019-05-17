package com.job.interview.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.interview.petclinic.dto.MascotaDTO;
import com.job.interview.petclinic.entity.Cliente;
import com.job.interview.petclinic.exceptions.NotExistException;
import com.job.interview.petclinic.repository.ClienteRepository;
import com.job.interview.petclinic.repository.MascotaRepository;

@Service
public class MascotaService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	MascotaRepository mascotaRepository;

	public void saveMascota(MascotaDTO mascotaDTO) throws NotExistException {
		Cliente cliente = clienteRepository.findById(mascotaDTO.getDuenioId()).orElseThrow(() -> new NotExistException("No existe el cliente."));
		cliente.getMascotas().add(mascotaDTO.getMascota());
		clienteRepository.save(cliente);
	}

}
