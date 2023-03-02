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

import com.sistechtecnologia.SisTechAPI.entities.Cliente;
import com.sistechtecnologia.SisTechAPI.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		List<Cliente> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{codigo}")
	public ResponseEntity<Cliente> findById(@PathVariable String codigo) {
		Cliente obj = service.findById(codigo); 
		
		return ResponseEntity.ok().body(obj);
	}
	
	@PutMapping(value = "/{codigo}")	
	public ResponseEntity<Void> update(@RequestBody Cliente cliente, @PathVariable String codigo) {							
		
		cliente.setCodigo(codigo);
		service.updateCliente(cliente);			
		
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping	
	public ResponseEntity<Cliente> insert(@RequestBody Cliente cliente) {							
				
		service.insertCliente(cliente);			
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{codigo}").buildAndExpand(cliente.getCodigo()).toUri();
		
		return ResponseEntity.created(uri).body(cliente); 
	}
	
}
