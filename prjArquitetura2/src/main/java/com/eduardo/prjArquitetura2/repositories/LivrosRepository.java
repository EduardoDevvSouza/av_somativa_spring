package com.eduardo.prjArquitetura2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.prjArquitetura2.entities.Livros;

public interface LivrosRepository extends JpaRepository<Livros, Long> {
	List<Livros> findByTitulo(Long titulo);
	Livros findByIsbm(Long isbm);

}

