package com.eduardo.prjArquitetura2.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eduardo.prjArquitetura2.entities.Categoria;
import com.eduardo.prjArquitetura2.repositories.CategoriaRepository;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria saveCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria getCategoriaById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public List<Categoria> getAllCategoria() {
        return categoriaRepository.findAll();
    }
}