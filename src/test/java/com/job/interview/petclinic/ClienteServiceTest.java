package com.job.interview.petclinic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import com.job.interview.petclinic.dto.ClienteDTO;
import com.job.interview.petclinic.entity.Cliente;
import com.job.interview.petclinic.exceptions.NotExistException;
import com.job.interview.petclinic.service.ClienteService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteServiceTest {
	
	@Autowired
	private ClienteService clienteService;
	
	Pageable page = PageRequest.of(0, 50);
	
	@Test(expected = NotExistException.class)
	public void givenClientWhenSaveClientThenRaiseAnException() throws NotExistException {
		
		ClienteDTO clienteDTO = new ClienteDTO();
		clienteDTO.setNombre("Nombre");
		clienteDTO.setTelefono("1122334455");
		clienteDTO.setVeterinariaId(999L);
		
		clienteService.saveCliente(clienteDTO);
	}
	
	@Test
	public void givenNoClientNameWhenGetClientesThenReturnAll() {
		Page<Cliente> clients = clienteService.getClientes(page, null);
		assertEquals(10L, clients.getTotalElements());
	}
	
	@Test
	public void givenClientNameWhenGetClientesThenReturnSingleMatch() {
		Page<Cliente> clients = clienteService.getClientes(page, "Julieta Bertoli");
		assertEquals(1, clients.getTotalElements());
	}
	

}
