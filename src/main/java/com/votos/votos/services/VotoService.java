package com.votos.votos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votos.votos.model.Voto;
import com.votos.votos.repository.VotoRepository;

@Service
public class VotoService {

	@Autowired
	private VotoRepository repository;
	
	public Voto inserirVoto(Voto voto) {
		
		return repository.saveAndFlush(voto);
		
	 
		}
	
	public List<Voto> findvotosbyPauta() {
		
		List<Voto> list =repository.findvotosbyPauta();
		return list;
		
		
	}
		
	
	
	
	
	
	
	
	
}

