package com.sistechtecnologia.SisTechAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistechtecnologia.SisTechAPI.entities.Parametro;
import com.sistechtecnologia.SisTechAPI.repositories.ParametroRepository;

@Service
public class ParametroService {
	
	@Autowired
	private ParametroRepository repository;
	
	public List<Parametro> findAll() {
		return repository.findAll();
	}
	
	public Parametro findById(String codigo) {
		Optional<Parametro> obj = repository.findById(codigo);
		return obj.get();
	}

}
