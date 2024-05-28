package com.eduardo.prjArquitetura2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@NotBlank
	@Column(name = "classificação", nullable = false, length = 100)
	private String classificação;
	
	@Column(name = "genero", nullable = false, length = 100)
	@NotBlank
	private String genero;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_autor", nullable = false)
	private Livros livros;
}
