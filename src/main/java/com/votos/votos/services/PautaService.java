package com.votos.votos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votos.votos.model.Asociado;
import com.votos.votos.model.Pauta;
import com.votos.votos.model.Voto;
import com.votos.votos.repository.AsociadoRepository;
import com.votos.votos.repository.PautaRepository;
@Service
public class PautaService {
	
	@Autowired
	private PautaRepository repository;
	
	public Pauta buscarPauta(Long id) {
		return repository.getOne(id);
	}
	

	
	public Pauta inserirPauta(Pauta pauta) {
		return repository.saveAndFlush(pauta);
	}
	public String deletarPauta(Long id) {
		Pauta  pauta = repository.getOne(id);
		if (pauta != null) {
			repository.delete(pauta);
			return "Deletado com sucesso";
		} else {
			return "Pauta não encontrado";
		}
	}
	
	public List<Pauta> getAllPauta(){
		
		List<Pauta> list = repository.findAll();
		
		return list;
	}
	

	

}
