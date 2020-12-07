package com.votos.votos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.votos.votos.model.Asociado;
import com.votos.votos.services.AsociadoService;

@RestController
@RequestMapping(value="/asociado")
public class AsociadoController {
	
	@Autowired
	private AsociadoService service;
	
	public AsociadoController(AsociadoService service) {
		this.service = service;
	}
	
	@PostMapping
	public String create(@RequestBody Asociado asociado) {
		return service.inserirAsociado(asociado);
	}
	
	@PutMapping
	public String update(@RequestBody Asociado asociado) {
		return service.inserirAsociado(asociado);
	}
	
	@GetMapping("/getByid/{id}")
	public Asociado getByid(@PathVariable Long id) {
		return service.buscarAsociado(id);
	}
	@GetMapping
	public List<Asociado> getAll() {
		return service.getAllAsociado();
	}
	
	@DeleteMapping("/deleteByid/{id}")
	public String deleteByid(@PathVariable Long id) {
		return service.deletarAsociado(id);
	}
	
	@PatchMapping
	public String patchUpdate(@RequestBody Asociado asociado) {
		return service.inserirAsociado(asociado);
	}
	

}
