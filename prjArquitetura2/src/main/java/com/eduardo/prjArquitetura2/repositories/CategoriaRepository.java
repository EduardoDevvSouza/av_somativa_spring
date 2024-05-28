package com.eduardo.prjArquitetura2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.prjArquitetura2.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {


}