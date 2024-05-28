package com.eduardo.prjArquitetura2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.prjArquitetura2.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {


}