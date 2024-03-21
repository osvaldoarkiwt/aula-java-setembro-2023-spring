package com.projeto.livraria.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.livraria.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

	public Optional<Livro> findByNome(String nome);
}
