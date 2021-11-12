package com.db.hospedagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class AirbnbCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbnbCloneApplication.class, args);
	}

	@Bean
	public CommandLineRunner com(UsuarioRepository repository) {
		return (args)->{
			repository.save(new Usuario());
		};
		
	}
}
