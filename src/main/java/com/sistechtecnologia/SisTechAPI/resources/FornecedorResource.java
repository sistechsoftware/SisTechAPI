package com.sistechtecnologia.SisTechAPI.resources;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.sistechtecnologia.SisTechAPI.entities.Fornecedor;
import com.sistechtecnologia.SisTechAPI.services.FornecedorService;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResource {
	
	@Autowired
	private FornecedorService service;
	
	@GetMapping
	public ResponseEntity<List<Fornecedor>> findAll() {
		
		List<Fornecedor> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{codigo}")
	public ResponseEntity<Fornecedor> findById(@PathVariable String codigo) {
		Fornecedor obj = service.findById(codigo); 
		
		return ResponseEntity.ok().body(obj);
	}
	
	@PutMapping(value = "/{codigo}")	
	public ResponseEntity<Void> update(@RequestBody Fornecedor fornecedor, @PathVariable String codigo) {							
		
		fornecedor.setCodigo(codigo);
		service.updateFornecedor(fornecedor);			
		
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping	
	public ResponseEntity<Fornecedor> insert(@RequestBody Fornecedor fornecedor) {							
				
		service.insertFornecedor(fornecedor);			
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{codigo}").buildAndExpand(fornecedor.getCodigo()).toUri();
		
		return ResponseEntity.created(uri).body(fornecedor); 
	}
	
}
