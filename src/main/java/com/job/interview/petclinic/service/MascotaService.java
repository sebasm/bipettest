package com.job.interview.petclinic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.job.interview.petclinic.dto.MascotaDTO;
import com.job.interview.petclinic.entity.Cliente;
import com.job.interview.petclinic.entity.Mascota;
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
	
	public Page<Mascota> getMascotas(Pageable page, String nombre) {
		if (nombre != null) {
			return mascotaRepository.findByNombre(page, nombre);
		}else {
			return mascotaRepository.findAll(page);
		}
	}

	public List<Mascota> getByClient(Long clientId) {
		List<Mascota> response = new ArrayList<Mascota>();
		Optional<Cliente> cliente = clienteRepository.findById(clientId);
		if(cliente.isPresent()) {
			response = cliente.get().getMascotas();
		}
		return response;
	}

	
	

}
