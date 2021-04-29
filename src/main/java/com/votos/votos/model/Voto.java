package com.votos.votos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.votos.votos.Request.VotoRequest;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "votos")
public class Voto {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Asociado asociado;
	
	@ManyToOne
	private Pauta pauta;
	
	private String voto;

	

	public Voto() {
	}

	public Voto(Long id, Asociado asociado, Pauta pauta, String voto) {
		this.id = id;
		this.asociado = asociado;
		this.pauta = pauta;
		this.voto = voto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Asociado getAsociado() {
		return asociado;
	}

	public void setAsociado(Asociado asociado) {
		this.asociado = asociado;
	}

	public Pauta getPauta() {
		return pauta;
	}

	public void setPauta(Pauta pauta) {
		this.pauta = pauta;
	}

	public String getVoto() {
		return voto;
	}

	public void setVoto(String voto) {
		this.voto = voto;
	}

	
	
	
		
	
	
}

		
	

	

	
	
	
			
		
	
	
	
	
	
	
	

