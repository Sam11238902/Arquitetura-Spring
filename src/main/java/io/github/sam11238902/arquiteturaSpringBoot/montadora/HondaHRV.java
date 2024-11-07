package io.github.sam11238902.arquiteturaSpringBoot.montadora;

import java.awt.Color;

public class HondaHRV extends Carro {

	public HondaHRV(Motor motor) {
		super(motor);
		
		setModelo("HRV");
		setCor(Color.BLACK);
		setMontadora(Montadora.HONDA);
	}

	
}
