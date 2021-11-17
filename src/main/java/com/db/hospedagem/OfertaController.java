package com.db.hospedagem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/hospedagem")
public class OfertaController {

	@Autowired
	private OfertaRepository repository;
	
	
	// INICIANDO CHAMADA DE DADOS
	@RequestMapping(value = "/{cidade}", method = RequestMethod.GET, produces = "application/json")
    public List<Oferta> getCidades(@RequestParam("cidade") String cidade) {
	    List<Oferta> ofertas = this.repository.findAllByCidade(cidade); 
		return ofertas;
    }
	
	@GetMapping("")
	public List<Oferta> all() {
		return (List<Oferta>) repository.findAll();
	}
}