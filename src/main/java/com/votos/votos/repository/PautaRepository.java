package com.votos.votos.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.votos.votos.model.Pauta;
import com.votos.votos.model.Voto;


@Repository
public interface PautaRepository extends JpaRepository<Pauta, Long> {

	public Optional<Pauta> findById(Long id);
	//@Query ("SELECT ")
}
