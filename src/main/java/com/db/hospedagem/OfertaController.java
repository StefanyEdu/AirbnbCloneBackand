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
public class OfertaController {

	@Autowired
	private OfertaRepository repository;
	
	@RequestMapping(value = "/{cidade}", method = RequestMethod.GET, produces = "application/json")
    public Oferta getCidade(@PathVariable("cidade") String cidade) {
		return this.repository.findByCidade(cidade);
    }
	
//	@GetMapping("/imovel/{imovel}")
//	public Optional<Oferta> getOferta(@PathVariable String imovel) {
//		return Optional.of(repository.findByImovel(imovel).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Imóvel não encontrado")));
//	}
	
	@GetMapping("/imoveis")
	public List<Oferta> all() {
		return (List<Oferta>) repository.findAll();
	}
}


