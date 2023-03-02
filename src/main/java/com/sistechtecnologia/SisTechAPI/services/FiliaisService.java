package com.sistechtecnologia.SisTechAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistechtecnologia.SisTechAPI.entities.Filiais;
import com.sistechtecnologia.SisTechAPI.repositories.FiliaisRepository;

@Service
public class FiliaisService {
	
	@Autowired
	private FiliaisRepository repository;
	
	public List<Filiais> findAll() {
		return repository.findAll();
	}
	
	public Filiais findById(String codigo) {
		Optional<Filiais> obj = repository.findById(codigo);
		return obj.get();
	}

}
