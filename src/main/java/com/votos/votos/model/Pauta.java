package com.votos.votos.model;

import java.io.Serializable;
import java.util.Date;

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

		@Column(name = "DATA_INICIO")
		private Date dataInicio;

		@Column(name = "DATA_FIM")
		private String DataFin;

		@Column(name = "STATUS")
		private String status;

		@Column(name = "TOTAL_VOTOS")
		private Integer votosTotais;

		@Column(name = "VOTOS_SIM")
		private Integer votosSim;

		@Column(name = "VOTOS_NAO")
		private Integer votosNao;

		

		public Pauta() {
		}

		public Pauta(Long id, String nome, String descricao, Date dataInicio, String dataFin, Integer votosTotais,
				Integer votosSim, Integer votosNao, String status) {
			this.id = id;
			this.nome = nome;
			this.descricao = descricao;
			this.dataInicio = dataInicio;
			DataFin = dataFin;
			this.votosTotais = votosTotais;
			this.votosSim = votosSim;
			this.votosNao = votosNao;
			this.status = status;
		}

		
		

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Date getDataInicio() {
			return dataInicio;
		}

		public void setDataInicio(Date dataInicio) {
			this.dataInicio = dataInicio;
		}

		public String getDataFin() {
			return DataFin;
		}

		public void setDataFin(String dataFin) {
			DataFin = dataFin;
		}

		public Integer getVotosTotais() {
			return votosTotais;
		}

		public void setVotosTotais(Integer votosTotais) {
			this.votosTotais = votosTotais;
		}

		public Integer getVotosSim() {
			return votosSim;
		}

		public void setVotosSim(Integer votosSim) {
			this.votosSim = votosSim;
		}

		public Integer getVotosNao() {
			return votosNao;
		}

		public void setVotosNao(Integer votosNao) {
			this.votosNao = votosNao;
		}
		
		
		
		
		
		
	}

	
