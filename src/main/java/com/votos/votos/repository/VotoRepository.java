package com.votos.votos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.votos.votos.model.Voto;

public interface VotoRepository extends JpaRepository<Voto, Long> {

	@Query(value="SELECT pa.NOME,COUNT(voto) as Votos_si FROM votos v LEFT JOIN Pauta pa on pa.id = v.id WHERE voto in ('nao') GROUP BY pa.NOME", nativeQuery = true )
	public List<Voto> findvotosbyPauta();
}
