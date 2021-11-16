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
@RequestMapping("/hospedagem/")
public class OfertaController {

	@Autowired
	private OfertaRepository repository;
	
	
	// INICIANDO CHAMADA DE DADOS
	@RequestMapping(value = "oferta", method = RequestMethod.POST, produces = "application/json")
    public Oferta postQuarto(@RequestParam("cidade") String cidade) {
		Oferta of = new Oferta();
		of.setCidade(cidade);
		repository.save(of);
		repository.findAll();
		return of;
    }
	
	@GetMapping("imoveis")
	public List<Oferta> all() {
		return (List<Oferta>) repository.findAll();
	}
}