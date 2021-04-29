package com.votos.votos.services;

import com.votos.votos.Request.VotoRequest;
import com.votos.votos.model.Voto;

public abstract class AbstractConverter<D, E> {

    public abstract D fomDto(E dto);
    
    public abstract E fromEntity(D entity);
    

}
