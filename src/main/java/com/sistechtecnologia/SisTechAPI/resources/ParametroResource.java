package com.sistechtecnologia.SisTechAPI.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sistechtecnologia.SisTechAPI.entities.Parametro;
import com.sistechtecnologia.SisTechAPI.services.ParametroService;

@Controller
//@RequestMapping(value = "/parametros")
public class ParametroResource {
	
	@Autowired
	private ParametroService service;
	
	//@GetMapping
	@RequestMapping(value = "/parametros", method = RequestMethod.GET)
	public ResponseEntity<List<Parametro>> findAll() {
		//List<Parametro> list = new ArrayList<>();//service.findAll();
		//Parametro p = new Parametro("1", "Parametro", "P", "S");
		//list.add(p);
		
		List<Parametro> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{codigo}")
	public ResponseEntity<Parametro> findById(@PathVariable String codigo) {
		Parametro obj = service.findById(codigo); 
		
		return ResponseEntity.ok().body(obj);
	}
	
}
