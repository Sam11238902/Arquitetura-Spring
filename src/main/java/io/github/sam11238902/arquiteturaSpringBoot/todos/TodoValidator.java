package io.github.sam11238902.arquiteturaSpringBoot.todos;

import org.springframework.stereotype.Component;

// CLASSE PARA VALIDAR O TODO .
//TORNA A CLASSE UM BEAN , DO SPRING . VIRA UM COMPONENTE DENTRO DO CONTAINER DO SPRING.
@Component
public class TodoValidator {
	
	TodoRepository todoRepository;
	
	
	
	public TodoValidator(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public void todoValidator(TodoEntity todo) {
		if(existTodoDescription(todo.getDescription())) {
			
			throw new IllegalArgumentException("Ja existe TODO com essa descrição.");
	
		}else {
			
		}
		
	}
	
	
	public boolean 	existTodoDescription(String description) {
				
		return todoRepository.existsByDescription(description);
	}
	
	

}
