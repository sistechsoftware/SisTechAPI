package com.sistechtecnologia.SisTechAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistechtecnologia.SisTechAPI.entities.Cliente;
import com.sistechtecnologia.SisTechAPI.entities.Produto;
import com.sistechtecnologia.SisTechAPI.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> findAll() {
		return repository.findAll();
	}
	
	public Produto findById(String codigo) {
		Optional<Produto> obj = repository.findById(codigo);
		return obj.get();
	}

}
