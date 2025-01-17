package com.projeto.livraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projeto.livraria.model.Livro;
import com.projeto.livraria.service.LivroService;

@Controller
public class AppController {

	@Autowired
	LivroService servico;
	
	@RequestMapping("/")
	public String inicio() {
		/*
		Livro livro = new Livro();
		
		livro.setNome("O Ensaio sobre a cegueira");
		livro.setAutor("José saramago");
		livro.setPreco(110);
		livro.setQuantidade(4);
		
		servico.salvarLivro(livro);
		
		System.out.println("Livro salvo com sucesso!");
		
		Livro livro = servico.encontrarLivroPeloId(3L);
		String resposta = livro != null ? livro.toString() : "o livro solicitado não foi encontrado";
		
		System.out.println(resposta);
		List<Livro> livros = servico.encontrarTodosOsLivros();
		
		livros.stream().forEach(System.out::println);
		servico.deletarLivro(1L);
		*/

		Livro livro = servico.encontrarLivroPeloNome("O Ensaio sobre a cegueira");
		
		String resposta = livro != null ? livro.toString() : "livro não encontrado";
		
		System.out.println(resposta);
		
		return "index";
	}
	
}
