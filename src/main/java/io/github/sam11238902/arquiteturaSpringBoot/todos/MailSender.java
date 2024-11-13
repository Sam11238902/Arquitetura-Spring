package io.github.sam11238902.arquiteturaSpringBoot.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {
	
	
	
	public void sendEmail(String mensage) {
		
		System.out.println("Enviado o email" + mensage);
		
	}

}
