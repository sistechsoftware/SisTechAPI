package com.sistechtecnologia.SisTechAPI.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sistechtecnologia.SisTechAPI.entities.Cliente;
import com.sistechtecnologia.SisTechAPI.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> findAll() {
		return repository.findAll();
	}
	
	public Cliente findById(String codigo) {
		Optional<Cliente> obj = repository.findById(codigo);
		return obj.get();
	}

}
