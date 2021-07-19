package com.projeto.maven.demo.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.projeto.maven.demo.model.entities.Produto;

public interface ProdutoRepository 
	extends CrudRepository<Produto, Integer> {

	 
}
