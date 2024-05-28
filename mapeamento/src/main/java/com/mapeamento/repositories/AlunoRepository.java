package com.mapeamento.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mapeamento.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	//Query Methods
	List<Aluno> findByCidade(String cidade);
	Aluno findByRa(String ra);
	Aluno salvar(Aluno aluno);
	List<Aluno> findByNomeAndRenda(String nome, Double renda);
	List<Aluno> findByCidadeAndRenda(String cidade, Double renda);
	List<Aluno> findByNome(String nome);
	List<Aluno> findByNomeLike(String nomeCompleto);
	List<Aluno> findByTurmaId(Long turmaId);

}