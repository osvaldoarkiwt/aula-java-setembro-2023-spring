package com.projeto.livraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.livraria.model.Livro;
import com.projeto.livraria.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	LivroRepository repository;
	
	public void salvarLivro(Livro livro) {
		
		repository.save(livro);
	}
	
	public Livro encontrarLivroPeloId(Long id) {
	
		return repository.findById(id).orElse(null);
	}
	
	
	public Livro encontrarLivroPeloNome(String nome) {
		
		return repository.findByNome(nome).orElse(null);
		
	}
	
	public List<Livro> encontrarTodosOsLivros(){
		
		return repository.findAll();
	}
	
	public void deletarLivro(Long id) {
		
		Livro livro = encontrarLivroPeloId(id);
		
		if(livro != null) {
			repository.delete(livro);
		}
		else {
			System.out.println("Livro não encontrado");
		}
		
	}
}
