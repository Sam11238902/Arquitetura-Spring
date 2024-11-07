package io.github.sam11238902.arquiteturaSpringBoot.montadora;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {
	
	
	@Bean
	public Motor motor() {
		var motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("XPT-9");
		motor.setLitragem(2.0);
		motor.setTipo(TipoMotor.ASPIRADO);
		
		
		return motor;
		
	}
	

}
