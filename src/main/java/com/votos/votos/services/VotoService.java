package com.votos.votos.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.hibernate.boot.model.convert.internal.AbstractConverterDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;

import com.votos.votos.Request.VotoRequest;
import com.votos.votos.model.Pauta;
import com.votos.votos.model.Voto;
import com.votos.votos.repository.PautaRepository;
import com.votos.votos.repository.VotoRepository;



@Service
public class VotoService {



	public VotoService() {
	}

	public VotoService(PautaRepository repositorypauta, VotoRepository repository,
			AbstractConverter<VotoRequest, Voto> converter) {
		this.repositorypauta = repositorypauta;
		this.repository = repository;
		this.converter = converter;
	}

	private PautaRepository repositorypauta;
	@Autowired
	private VotoRepository repository;
	
	private AbstractConverter<VotoRequest, Voto> converter;
	
	public void inserirVoto(@Valid VotoRequest request) {
		Integer votosumarsi = 0;
		Integer votosumarno = 0;

		Optional<Pauta> pauta = repositorypauta.findById(request.getPauta().getId());
		if (request.getVoto()=="SIM"){
			votosumarsi =	pauta.get().getVotosSim()+1;
			pauta.get().setVotosSim(votosumarsi);
			
		}else if(request.getVoto()=="NAO"){
			votosumarno =	pauta.get().getVotosNao()+1;
			pauta.get().setVotosNao(votosumarno);

		}
		if(request.getVoto()!=null){
			Integer total=votosumarno+votosumarsi;
			pauta.get().setVotosTotais(total);

		}
		Voto novo = converter.fromEntity(request);
		
		repository.save(novo);
		
		
		
	 
		}
	
	
	
}

