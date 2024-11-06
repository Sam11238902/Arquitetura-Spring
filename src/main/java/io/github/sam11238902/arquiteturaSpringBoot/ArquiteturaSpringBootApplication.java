package io.github.sam11238902.arquiteturaSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ArquiteturaSpringBootApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(ArquiteturaSpringBootApplication.class, args);
	
		
		
		// faz a mesma coisa do codigo acima .
		SpringApplicationBuilder build = new SpringApplicationBuilder(ArquiteturaSpringBootApplication.class);	
		build.run(args);
	
	}
}
