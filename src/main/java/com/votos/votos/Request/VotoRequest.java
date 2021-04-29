package com.votos.votos.Request;

import java.io.Serializable;

import com.votos.votos.model.Asociado;
import com.votos.votos.model.Pauta;

public class VotoRequest implements Serializable{
    private Long id;
    
    private Asociado asociado;

    private Pauta pauta;

    private String voto;

    

    public VotoRequest() {
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



    public VotoRequest(Long id,Asociado asociado, Pauta pauta, String voto) {
        this.asociado = asociado;
        this.pauta = pauta;
        this.voto = voto;
        this.id = id;
    }

    
}
