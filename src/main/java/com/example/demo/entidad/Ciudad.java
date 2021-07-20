package com.example.demo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciudad")
public class Ciudad {

		

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDE_CIUDAD")
	
	private long ideCiudad;

	@Column(name = "NOM_CIUDAD")
	private String nomCiudad;

	
	public long getIdeCiudad() {
		return ideCiudad;
	}

	public void setIdeCiudad(long ideCiudad) {
		this.ideCiudad = ideCiudad;
	}

	public String getNomCiudad() {
		return nomCiudad;
	}

	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}
	

	public Ciudad(long ide_ciudad, String nom_ciudad) {

		this.ideCiudad = ide_ciudad;
		this.nomCiudad = nom_ciudad;
	}

	public Ciudad() {

	}


	@Override
	public String toString() {
		return "Ciudad [ide_ciudad=" + ideCiudad + ", nom_ciudad=" + nomCiudad + "]";
	}

}
