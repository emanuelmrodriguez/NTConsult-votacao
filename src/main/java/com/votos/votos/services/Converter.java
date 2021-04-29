package com.votos.votos.services;

import com.votos.votos.Request.VotoRequest;
import com.votos.votos.model.Voto;

public class Converter extends AbstractConverter<VotoRequest , Voto> {

    public Voto fromDto(VotoRequest request){
        Voto voto = new Voto();
        voto.setId(request.getId());
        voto.setAsociado(request.getAsociado());
        voto.setPauta(request.getPauta());
        voto.setVoto(request.getVoto());

        return voto;
        
    }

    public VotoRequest fromEntity(Voto entity){
        VotoRequest request = new VotoRequest();
        request.setId(entity.getId());
        request.setAsociado(entity.getAsociado());
        request.setPauta(entity.getPauta());
        request.setVoto(entity.getVoto());

        return request;
    }

    @Override
    public VotoRequest fomDto(Voto dto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Voto fromEntity(VotoRequest entity) {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
