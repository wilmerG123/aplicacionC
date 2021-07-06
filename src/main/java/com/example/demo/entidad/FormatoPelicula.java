package com.example.demo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FORMATO_PELICULA")
public class FormatoPelicula {
	
	@Id
	@Column(name="IDE_FORMATO_PELICULA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ideFormatoPelicula;
	@Column(name="NOM_FORMATO_PELICULA")
	private String nomFormatoPelicula;
	public Long getIdeFormatoPelicula() {
		return ideFormatoPelicula;
	}
	public void setIdeFormatoPelicula(Long ideFormatoPelicula) {
		this.ideFormatoPelicula = ideFormatoPelicula;
	}
	public String getNomFormatoPelicula() {
		return nomFormatoPelicula;
	}
	public void setNomFormatoPelicula(String nomFormatoPelicula) {
		this.nomFormatoPelicula = nomFormatoPelicula;
	}
	public FormatoPelicula(Long ideFormatoPelicula, String nomFormatoPelicula) {
	
		this.ideFormatoPelicula = ideFormatoPelicula;
		this.nomFormatoPelicula = nomFormatoPelicula;
	}
	public FormatoPelicula() {
	
	}
	@Override
	public String toString() {
		return "FormatoPelicula [ideFormatoPelicula=" + ideFormatoPelicula + ", nomFormatoPelicula="
				+ nomFormatoPelicula + "]";
	}

	
	
}
