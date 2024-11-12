package io.github.sam11238902.arquiteturaSpringBoot.todos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController {

	
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	@GetMapping({"/{id}"})
	public TodoEntity buscarPorId(@PathVariable("id")Integer id) {
			return todoService.buscarId(id);	
	}
	
	
	
	
	@PostMapping
	@ResponseBody
	public TodoEntity salvar(@RequestBody TodoEntity todo) {
		return todoService.salvar(todo);
	}
	
	
	@PutMapping("/{id}")
	public void atulizarStatus(@PathVariable("id")Integer id, @RequestBody TodoEntity todo) {
		todo.setId(id);
		todoService.atualizarTodo(todo);
	
}
}