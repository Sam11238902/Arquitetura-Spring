package io.github.sam11238902.arquiteturaSpringBoot.todos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer>{

	
	boolean existsByDescription(String description);
	
}
