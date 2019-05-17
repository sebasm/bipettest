package com.job.interview.petclinic;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.job.interview.petclinic.dto.MascotaDTO;
import com.job.interview.petclinic.entity.Cliente;
import com.job.interview.petclinic.exceptions.NotExistException;
import com.job.interview.petclinic.repository.ClienteRepository;
import com.job.interview.petclinic.service.MascotaService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MascotaServiceTest {
	
	@InjectMocks
	private MascotaService mascotaService;
	
	@Mock
	private ClienteRepository clienteRepository;
	
	
	@Test(expected = NotExistException.class)
	public void givenMascotaWhenSaveMascotaThenRaiseException(){
		
		MascotaDTO mascota = new MascotaDTO();
		mascota.setNombre("Bobby");
		mascota.setDuenioId(999L);
		
		Optional<Cliente> clienteInexistente = Optional.empty();
		
		when(clienteRepository.findById(999L)).thenReturn(clienteInexistente);

		mascotaService.saveMascota(mascota);
	}
	

}
