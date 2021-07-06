package com.example.demo.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ClientePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "IDE_TIPO_IDENTIFICACION")
	private TipoIdentificacion tipoIdentificacion;

	@Column(name = "NUM_IDENTIFICACION")
	private Long numIdentificacion;

	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public Long getNumIdentificacion() {
		return numIdentificacion;
	}

	public void setNumIdentificacion(Long numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}

	public ClientePK(TipoIdentificacion tipoIdentificacion, Long numIdentificacion) {
		
		this.tipoIdentificacion = tipoIdentificacion;
		this.numIdentificacion = numIdentificacion;
	}

	public ClientePK() {
		
	}

	@Override
	public String toString() {
		return "ClientePK [tipoIdentificacion=" + tipoIdentificacion + ", numIdentificacion=" + numIdentificacion + "]";
	}

}
