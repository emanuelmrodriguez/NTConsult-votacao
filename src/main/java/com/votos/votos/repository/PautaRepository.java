package com.votos.votos.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.votos.votos.model.Pauta;
import com.votos.votos.model.Voto;


@Repository
public interface PautaRepository extends JpaRepository<Pauta, Long> {

	//@Query ("SELECT ")
}
