package com.eduardo.prjArquitetura2.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.prjArquitetura2.entities.Categoria;
import com.eduardo.prjArquitetura2.servicies.CategoriaService;

@RestController
@RequestMapping("/categoria")

public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
    

    @PostMapping
    public Categoria createProduct(@RequestBody Categoria categoria) {
        return categoriaService.saveCategoria(categoria);
    }

    @GetMapping("/{id}")
    public Categoria getCategoria(@PathVariable Long id) {
        return categoriaService.getCategoriaById(id);
    }

    @GetMapping
    public List<Categoria> getAllCategorias() {
        return categoriaService.getAllCategoria();
    }
}