package io.github.sam11238902.arquiteturaSpringBoot.todos;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//SERVICE É  UM COMPONENTE , O NOME SERVICE É UMA QUESTÃO SEMANTICA PARA LEITURA DE CODIGO COM BASE NO MODELO MVC. 
@Service
public class TodoService {
	
	
	
	@Autowired
	private TodoRepository todoRepository;
	
	@Autowired
	private TodoValidator todoValidator;
	
	@Autowired
	private MailSender mailSender;

	
	
	
	/*

	public TodoService(TodoRepository todoRepository,TodoValidator todoValidator, MailSender mailSender) {
		this.todoRepository = todoRepository;
		this.todoValidator = todoValidator;
		this.mailSender = mailSender;
	}
	*/
	
	
	
	
	

	public TodoEntity salvar(TodoEntity todoEntity) {

		todoValidator.todoValidator(todoEntity);
		return todoRepository.save(todoEntity);

	}

	public void atualizarTodo(TodoEntity todo) {
		todoRepository.save(todo);
		
		String status = todo.getConcluido() == Boolean.TRUE ? "concluido" : "Nao concluido";
		mailSender.sendEmail("Todo" + todo.getDescription() + "foi atualizado para " + status);
	
	
	}

	public TodoEntity buscarId(Integer id) {
		return todoRepository.findById(id).orElse(null);

	}
}
