package com.votos.votos.Response;

import com.votos.votos.model.Pauta;

public class PautaResponse {

    private String nome;

    private String descricao;

    private String status;

    
    private Integer votosTotais;

		
	private Integer votosSim;

		
	private Integer votosNao;


    

    

    public PautaResponse() {
    }

    public PautaResponse(String nome, String descricao, String status, Integer votosTotais, Integer votosSim,
            Integer votosNao) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.votosTotais = votosTotais;
        this.votosSim = votosSim;
        this.votosNao = votosNao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    
    public void convertePauta(Pauta pauta) {
       this.nome = pauta.getNome();
       this.descricao = pauta.getDescricao();
       this.status = pauta.getStatus();
       this.votosTotais = pauta.getVotosTotais();
       this.votosSim = pauta.getVotosSim();
       this.votosNao = pauta.getVotosNao();
    }
}
