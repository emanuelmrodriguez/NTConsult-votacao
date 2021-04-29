package com.votos.votos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.votos.votos.Request.VotoRequest;
import com.votos.votos.model.Pauta;
import com.votos.votos.model.Voto;
import com.votos.votos.services.VotoService;

@RestController
@RequestMapping(value="/voto")
public class VotoController {
	
	public String ganador;
	
	@Autowired
	private VotoService service;
	
	public VotoController(VotoService voto) {
		this.service = voto;
	}
	
	@PostMapping
	public ResponseEntity<Void> create(@RequestBody VotoRequest request) {
		service.inserirVoto(request);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
}

	
	
