package com.votos.votos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.votos.votos.model.Asociado;

@Repository
public interface AsociadoRepository extends JpaRepository<Asociado, Long> {

}
