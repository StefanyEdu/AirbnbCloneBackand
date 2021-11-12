package com.db.hospedagem.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.db.hospedagem.entities.Oferta;

@Repository
public interface OfertaRepository extends CrudRepository<Oferta, Long> {
		
		Optional<Oferta> findById(String imovel);
		
		List<Oferta> findByImovel(String imovel);
		
		List<Oferta> findByQuantQuartos(Integer quantQuartos);
		
		List<Oferta> findByCidade(String cidade);
		
		List<Oferta> findByUf(String uf);
		
		List<Oferta> findAll();

	}


