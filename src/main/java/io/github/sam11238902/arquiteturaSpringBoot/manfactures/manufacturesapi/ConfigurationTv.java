package io.github.sam11238902.arquiteturaSpringBoot.manfactures.manufacturesapi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.sam11238902.arquiteturaSpringBoot.manfactures.model.TelevisionControl;
import io.github.sam11238902.arquiteturaSpringBoot.manfactures.model.TypeScreen;


@Configuration
public class ConfigurationTv {
	
	@Bean(name = "typeLed")
	public TypeScreen TypeScreen() {
		
		TypeScreen typeScreenLed = new TypeScreen("LED","55POLEGADAS");
		return typeScreenLed;
		
	}
	
	
	@Bean(name = "typeLcd")
	public TypeScreen TypeScreenLcd() {
		
		TypeScreen typeScreenLcd = new TypeScreen("Lcd","55POLEGADAS");
		return typeScreenLcd;
		
	}
	

}
