package com.votos.votos.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.bytecode.internal.javassist.BulkAccessorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javassist.NotFoundException;

import com.google.common.util.concurrent.ExecutionError;
import com.votos.votos.Response.PautaResponse;
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
	
	public PautaResponse listarPauta (Long id) {
		Optional<Pauta> pauta = repository.findById(id);
		if(!pauta.isPresent()){
			try {
				throw new NotFoundException("Pauta no encontrada");
			} catch (NotFoundException e) {
				
			}
		}
		PautaResponse retorno = new PautaResponse();
		retorno.convertePauta(pauta.get());
		return retorno;
	}
	

	

}
