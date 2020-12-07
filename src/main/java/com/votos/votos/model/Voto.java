package com.votos.votos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
	
	
	
		
	

	
	public Voto(Asociado asociado, Pauta pauta) {
		super();
		this.asociado = asociado;
		this.pauta = pauta;
	}
		
		
	
	
}

		
	

	

	
	
	
			
		
	
	
	
	
	
	
	

