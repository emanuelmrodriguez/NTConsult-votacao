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

import com.votos.votos.Response.PautaResponse;
import com.votos.votos.model.Pauta;
import com.votos.votos.model.Voto;
import com.votos.votos.services.PautaService;

@RestController
@RequestMapping(value="/pauta")
public class PautaController {
	
	@Autowired
	private PautaService service;
	
	
	public PautaController(PautaService service) {
		this.service = service;
	}
	
	@PostMapping
	public Pauta create(@RequestBody Pauta pauta) {
		return service.inserirPauta(pauta);
	}
	
	
	@GetMapping("/getByid")
	public PautaResponse getByid(@PathVariable Long id) {
		return service.listarPauta(id);
	}
	
	
	

	
	
}
