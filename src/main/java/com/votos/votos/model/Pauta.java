package com.votos.votos.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	@Entity 
	@Table(name = "Pauta")
	public class Pauta implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "NOME")
		private String nome;
		
		@Column(name = "DESCRICAO")
		private String descricao;
		
		
		
		
		
		
	}

	
