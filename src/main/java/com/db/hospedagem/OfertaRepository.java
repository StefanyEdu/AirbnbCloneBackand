package com.db.hospedagem;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRepository extends CrudRepository<Oferta, String> {
		
		List<Oferta> findByImovel(String imovel);
		
		Oferta findByQuantQuartos(Integer quantQuartos);
		
		Oferta findByCidade(String cidade);
		
		Oferta findByUf(String uf);

	}


