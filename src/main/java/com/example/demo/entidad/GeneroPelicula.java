package com.example.demo.entidad;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENERO_PELICULA")
public class GeneroPelicula {

	@Id
	@Column(name = "IDE_GENERO_PELICULA")
	private Long ideGeneroPelicula;

	@Column(name = "NOM_GENERO")
	private String nomGenero;

	public Long getIdeGeneroPelicula() {
		return ideGeneroPelicula;
	}

	public void setIdeGeneroPelicula(Long ideGeneroPelicula) {
		this.ideGeneroPelicula = ideGeneroPelicula;
	}

	public String getNomGenero() {
		return nomGenero;
	}

	public void setNomGenero(String nomGenero) {
		this.nomGenero = nomGenero;
	}

	public GeneroPelicula(List<GeneroPelicula> generos, Long ideGeneroPelicula, String nomGenero) {

		this.ideGeneroPelicula = ideGeneroPelicula;
		this.nomGenero = nomGenero;
	}

	public GeneroPelicula() {

	}

	@Override
	public String toString() {
		return "GeneroPelicula [ideGeneroPelicula=" + ideGeneroPelicula + ", nomGenero=" + nomGenero + "]";
	}

}
