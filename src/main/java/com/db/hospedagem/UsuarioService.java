package com.db.hospedagem;

import java.util.List;
import java.util.Optional;
/*
*
* *
* @author Danieli Tessaro
* @author Stefany Eduarda
*/

//METODOS PARA CONSULTA DO BASE DE DADOS 
public class UsuarioService implements UsuarioRepository {
	 private UsuarioRepository repository;
	

	public UsuarioService(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public <S extends Usuario> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Usuario> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Usuario> findAllById(Iterable<String> ids) {
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
	public void delete(Usuario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Usuario> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> findByNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByCpf(String cpf) {
		 Usuario user = null;
		 user=repository.findByCpf(cpf);
		return user;
	}

	@Override
	public Usuario findByTelefone(String telefone) {
		// TODO Auto-generated method stub
		return null;
	}

}
