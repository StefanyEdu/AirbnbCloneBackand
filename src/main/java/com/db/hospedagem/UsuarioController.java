package com.db.hospedagem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/cidades")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@RequestMapping(value = "/{cliente}", method = RequestMethod.GET, produces = "application/json")
    public Usuario getCpf(@PathVariable("cpf") String cpf) {
         return this.repository.findByCpf(cpf);
//	         return Optional.of(repository.findByCpf(cpf).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cpf não encontrado")));
    }
	
//		@GetMapping("/cliente/{nome}")
//		public Optional<Usuario> getCpf(@PathVariable String cpf) {
//			return Optional.of(repository.findByCpf(cpf).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cpf não encontrado")));
//		}
	
	@GetMapping("/cliente")
	public List<Usuario> all() {
		return repository.findAll();
	}
}


