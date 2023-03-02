package com.sistechtecnologia.SisTechAPI.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistechtecnologia.SisTechAPI.entities.Filiais;
import com.sistechtecnologia.SisTechAPI.services.FiliaisService;

@RestController
@RequestMapping(value = "/filiais")
public class FiliaisResource {
	
	@Autowired
	private FiliaisService service;
	
	@GetMapping
	public ResponseEntity<List<Filiais>> findAll() {
		List<Filiais> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{codigo}")
	public ResponseEntity<Filiais> findById(@PathVariable String codigo) {
		Filiais obj = service.findById(codigo); 
		
		return ResponseEntity.ok().body(obj);
	}
	
}
