package io.github.sam11238902.arquiteturaSpringBoot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

	
	
	//QUALIFIER É UTILIZADO QUANDO EXISTE MAIS DE UM BEAN DO MESMO TIPO , DENTRO DO CONTAINER DE CONFIGURAÇÃO ,
	//NOS DAMOS UM NOME AO BEAN COM O ATRIBUTO NAME , E UTILIZAMOS O QUALIFIER ABAIXO DA INJEÇAO COM O ATRIBUTO DO NOME DO BEAN . 
	
	@Autowired
	@Qualifier(value = "motorAspirado")
	private Motor motorAspirado;
	
	
	
	@Autowired
	@Qualifier(value = "motorEletrico")
	private Motor motorEletrico;
	
	
	@Autowired
	@Qualifier(value = "motorTurbo")
	private Motor motorTurbo;
	
	
	
	
	@PostMapping("/carros")
	public CarroStatus ligarCarro(@RequestBody Chave chave) {
		var carro = new HondaHRV(motorAspirado);
		
		
		
		return carro.darIgnicao(chave);
		
		
		
		
		
	}
}
