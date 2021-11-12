package com.db.hospedagem;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	List<Usuario> findByNome(String nome);
	Usuario findByEmail(String email);
	Usuario findByCpf(String cpf);
	Usuario findByTelefone(String telefone);
	List<Usuario> findAll();

}
