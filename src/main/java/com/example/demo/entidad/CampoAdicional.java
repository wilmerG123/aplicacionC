package com.example.demo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAMPO_ADICIONAL")
public class CampoAdicional {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDE_CAMPO_ADICIONAL")
	private Long ideCampoAdicional;
	
	@Column(name="NOM_CAMPO")
	private String nomCampo;

	public Long getIdeCampoAdicional() {
		return ideCampoAdicional;
	}

	public void setIdeCampoAdicional(Long ideCampoAdicional) {
		this.ideCampoAdicional = ideCampoAdicional;
	}

	public String getNomCampo() {
		return nomCampo;
	}

	public void setNomCampo(String nomCampo) {
		this.nomCampo = nomCampo;
	}
	
	
	
	
}
