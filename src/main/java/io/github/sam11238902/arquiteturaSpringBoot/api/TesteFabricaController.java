package io.github.sam11238902.arquiteturaSpringBoot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.sam11238902.arquiteturaSpringBoot.montadora.Carro;
import io.github.sam11238902.arquiteturaSpringBoot.montadora.CarroStatus;
import io.github.sam11238902.arquiteturaSpringBoot.montadora.Chave;
import io.github.sam11238902.arquiteturaSpringBoot.montadora.HondaHRV;
import io.github.sam11238902.arquiteturaSpringBoot.montadora.Motor;

@RestController
public class TesteFabricaController {

	
	
	@Autowired
	private Motor motor;
	
	
	@PostMapping("/carros")
	public CarroStatus ligarCarro(@RequestBody Chave chave) {
		var carro = new HondaHRV(motor);
		
		
		
		return carro.darIgnicao(chave);
		
		
		
		
		
	}
}
