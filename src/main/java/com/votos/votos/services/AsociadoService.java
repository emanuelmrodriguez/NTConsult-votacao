package com.votos.votos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.votos.votos.model.Asociado;
import com.votos.votos.repository.AsociadoRepository;
import com.votos.votos.validate.CpfValidacion; 

@Service
public class AsociadoService {
	
	@Autowired
	private AsociadoRepository repository;
	
	public Asociado buscarAsociado(Long id) {
		return repository.getOne(id);
	}
	//Al inserir valida el cpf si es True , sino retorna invalido
	public String inserirAsociado(Asociado asociado) {
		if(CpfValidacion.validar(asociado.getCpf())) {
			repository.saveAndFlush(asociado);
			return "OK";
		}else
		return "CPF INVALIDO";
	}
	public String deletarAsociado(Long id) {
		Asociado asociado = repository.getOne(id);
		if (asociado != null) {
			repository.delete(asociado);
			return "Deletado com sucesso";
		} else {
			return "Asociado não encontrado";
		}
	}
	
	public List<Asociado> getAllAsociado(){
		
		List<Asociado> list = repository.findAll();
		
		return list;
	}
	
	

}
