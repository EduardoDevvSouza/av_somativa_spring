package com.eduardo.prjArquitetura2.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.prjArquitetura2.entities.Livros;
import com.eduardo.prjArquitetura2.servicies.LivrosService;

@RestController
@RequestMapping("/livros")

public class LivrosController {
    private final LivrosService livrosService;

    public LivrosController(LivrosService livrosService) {
        this.livrosService = livrosService;
    }
    

    @PostMapping
    public Livros createProduct(@RequestBody Livros livros) {
        return livrosService.saveLivros(livros);
    }

    @GetMapping("/{id}")
    public Livros getLivros(@PathVariable Long id) {
        return livrosService.getLivrosById(id);
    }

    @GetMapping
    public List<Livros> getAllLivross() {
        return livrosService.getAllLivros();
    }
}