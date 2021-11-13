package com.db.hospedagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
*
* *
* @author Danieli Tessaro
* @author Stefany Eduarda
*/

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/cliente/")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@RequestMapping(value = "usuario", method = RequestMethod.POST, produces = "application/json")
    public  Usuario postCadastro(@RequestParam("cpf") String cpf) {
		Usuario user = new Usuario();
		user.setCpf(cpf);
		repository.save(user);
		return user;
    }
}