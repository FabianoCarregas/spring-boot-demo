package com.projeto.maven.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.maven.demo.model.entities.Cliente;
@RestController
@RequestMapping(path = "/clientes")
public class ClienteControler {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.222.222");
	}
	
	@GetMapping("/{id}")
	public Cliente ObterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}
	@GetMapping
	public Cliente ObterClientePorId2(
			@RequestParam(name= "id", defaultValue = "1") int id) {
		return new Cliente(id, "Otavio Macedo", "8877.676.3");
	}

}
