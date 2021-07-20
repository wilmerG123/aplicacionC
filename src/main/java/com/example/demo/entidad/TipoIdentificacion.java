package com.example.demo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_identificacion")
public class TipoIdentificacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDE_TIPO_IDENTIFICACION")
	private Long ideTipoIdentifiacion;
	
	@Column(name="NOM_TIPO_IDENTIFICACION")
	private String nomTipoIdentificacion;
	
	@Column(name="NOM_CORTO_TIPO_IDENT")
	private String nomCortoTipoIdent;

	public TipoIdentificacion() {
	
	}

	public TipoIdentificacion(Long ideTipoIdentifiacion, String nomTipoIdentificacion, String nomCortoTipoIdent) {
	
		this.ideTipoIdentifiacion = ideTipoIdentifiacion;
		this.nomTipoIdentificacion = nomTipoIdentificacion;
		this.nomCortoTipoIdent = nomCortoTipoIdent;
	}

	public Long getIdeTipoIdentifiacion() {
		return ideTipoIdentifiacion;
	}

	public void setIdeTipoIdentifiacion(Long ideTipoIdentifiacion) {
		this.ideTipoIdentifiacion = ideTipoIdentifiacion;
	}

	public String getNomTipoIdentificacion() {
		return nomTipoIdentificacion;
	}

	public void setNomTipoIdentificacion(String nomTipoIdentificacion) {
		this.nomTipoIdentificacion = nomTipoIdentificacion;
	}

	public String getNomCortoTipoIdent() {
		return nomCortoTipoIdent;
	}

	public void setNomCortoTipoIdent(String nomCortoTipoIdent) {
		this.nomCortoTipoIdent = nomCortoTipoIdent;
	}

	@Override
	public String toString() {
		return "TipoIdentificacion [ideTipoIdentifiacion=" + ideTipoIdentifiacion + ", nomTipoIdentificacion="
				+ nomTipoIdentificacion + ", nomCortoTipoIdent=" + nomCortoTipoIdent + "]";
	}
	
	
	
	
	

}
