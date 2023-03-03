package com.sistechtecnologia.SisTechAPI.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sistechtecnologia.SisTechAPI.entities.Fornecedor;
import com.sistechtecnologia.SisTechAPI.repositories.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository repository;
	
	public List<Fornecedor> findAll() {
		return repository.findAll();
	}
	
	public Fornecedor findById(String codigo) {
		Optional<Fornecedor> obj = repository.findById(codigo);
		return obj.get();
	}
	
	public void updateFornecedor(Fornecedor fornecedor) {
		
		Optional<Fornecedor> list = repository.findById(fornecedor.getCodigo());
		Fornecedor forn = list.orElseThrow();
		
		if (fornecedor.getId_empresa() == null) fornecedor.setId_empresa(forn.getId_empresa());			
		if (fornecedor.getBairro() == null) fornecedor.setBairro(forn.getId_empresa());			
		if (fornecedor.getCep() == null) fornecedor.setCep(forn.getId_empresa());	
		if (fornecedor.getCidade() == null) fornecedor.setCidade(forn.getCidade());	
		if (fornecedor.getCnae() == null) fornecedor.setCnae(forn.getCnae());	
		if (fornecedor.getCod_municipio_ibge() == null) fornecedor.setCod_municipio_ibge(forn.getCod_municipio_ibge());			
		if (fornecedor.getComplemento() == null) fornecedor.setComplemento(forn.getComplemento());		
				
		repository.save(fornecedor);
	}

	public void insertFornecedor(Fornecedor fornecedor) {
		repository.save(fornecedor);		
	}

}
