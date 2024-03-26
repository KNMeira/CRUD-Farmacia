package com.generation.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O nome da categoria não pode estar vazio!")
	@Size(min = 5, message = "O nome da categoria precisa ser maior que 5 caracteres!")
	@Size(max = 50, message = "O nome da categoria precisa ser menor 50 caracteres!")
	private String nome;
	
	@NotBlank(message = "A descrição de categoria não pode estar vazia!")
	@Size(min = 10, message = "A descrição precisa ter mais de 10 caracteres!")
	@Size(max = 255, message = "A descrição precisa ter menos de 255 caracteres!")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
