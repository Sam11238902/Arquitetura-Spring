package io.github.sam11238902.arquiteturaSpringBoot.todos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_todo")
public class TodoEntity {

	@Id // Seta essa propriedade como ID 
	@Column(name = "id")// NOME DA COLUNA DO BANCO
	@GeneratedValue(strategy = GenerationType.IDENTITY)// Deixa pro banco gerar o ID 
	private Integer id;
	
	
	@Column(name = "description")
	private String description;
	

	@Column(name = "fl_concluido")
	private Boolean concluido;

	
	public TodoEntity() {
		
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getConcluido() {
		return concluido;
	}

	public void setConcluido(Boolean concluido) {
		this.concluido = concluido;
	}
	
	
}
