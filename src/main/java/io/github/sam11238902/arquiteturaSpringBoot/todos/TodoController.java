package io.github.sam11238902.arquiteturaSpringBoot.todos;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;



// COMPONENTE RESTCONTROLLER PARA RECEBER REQUISICOES HTTP.
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
		
		try {
			return todoService.salvar(todo);
		} catch (IllegalArgumentException e) {
			var mensageErro = e.getMessage();
			
			throw new ResponseStatusException(HttpStatus.CONFLICT, mensageErro);
		}
		
		
	}
	
	
	@PutMapping("/{id}")
	public void atulizarStatus(@PathVariable("id")Integer id, @RequestBody TodoEntity todo) {
		todo.setId(id);
		todoService.atualizarTodo(todo);
}
}