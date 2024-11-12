package io.github.sam11238902.arquiteturaSpringBoot.todos;



import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private TodoRepository todoRepository;

	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	public TodoEntity salvar(TodoEntity todoEntity) {

		return todoRepository.save(todoEntity);

	}

	public void atualizarTodo(TodoEntity todo) {
		todoRepository.save(todo);
	}

	public TodoEntity buscarId(Integer id) {
		return todoRepository.findById(id).orElse(null);

	}
}
