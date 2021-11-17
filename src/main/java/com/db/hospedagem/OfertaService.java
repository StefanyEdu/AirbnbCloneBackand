package com.db.hospedagem;

import java.util.List;
import java.util.Optional;
/*
*
* *
* @author Danieli Tessaro
* @author Stefany Eduarda
*/

// METODOS PARA CONSULTA DO BASE DE DADOS 
public class OfertaService implements OfertaRepository {
     private OfertaRepository repository;
     
    
	public OfertaService(OfertaRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public <S extends Oferta> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Oferta> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Oferta> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Oferta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Oferta> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Oferta entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Oferta> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Oferta> findByImovel(String imovel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Oferta findByQuantQuartos(String quantQuartos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Oferta findByCidade(String cidade) {
		return repository.findByCidade(cidade);
	}

	@Override
	public Oferta findByUf(String uf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Oferta findByPreco(String preco) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Oferta findByDisponibilidade(String disponibilidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Oferta findByDiarias(String diarias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Oferta> findAllByCidade(String cidade) {
		return repository.findAllByCidade(cidade);
	}

}
