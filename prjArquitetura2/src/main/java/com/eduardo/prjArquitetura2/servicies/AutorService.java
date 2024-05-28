package com.eduardo.prjArquitetura2.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eduardo.prjArquitetura2.entities.Autor;
import com.eduardo.prjArquitetura2.repositories.AutorRepository;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Autor saveAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor getAutorById(Long id) {
        return autorRepository.findById(id).orElse(null);
    }

    public List<Autor> getAllAutor() {
        return autorRepository.findAll();
    }
}