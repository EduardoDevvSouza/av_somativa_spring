package com.eduardo.prjArquitetura2.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eduardo.prjArquitetura2.entities.Livros;
import com.eduardo.prjArquitetura2.repositories.LivrosRepository;

@Service
public class LivrosService {
    private final LivrosRepository livrosRepository;

    public LivrosService(LivrosRepository livrosRepository) {
        this.livrosRepository = livrosRepository;
    }

    public Livros saveLivros(Livros livros) {
        return livrosRepository.save(livros);
    }

    public Livros getLivrosById(Long id) {
        return livrosRepository.findById(id).orElse(null);
    }

    public List<Livros> getAllLivros() {
        return livrosRepository.findAll();
    }
}