package com.example.demo.entidad;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SILLA_RESERVADA")
public class SillaReservada implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@EmbeddedId
	private SillaReservadaPK sillareservadapk;
	
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="IDE_TIPO_IDENT_CLIENTE", referencedColumnName ="IDE_TIPO_IDENTIFICACION" ),
		@JoinColumn(name="NUM_IDENT_CLIENTE", referencedColumnName = "NUM_IDENTIFICACION")	
	})
	private Cliente cliente;


	public SillaReservadaPK getSillareservadapk() {
		return sillareservadapk;
	}


	public void setSillareservadapk(SillaReservadaPK sillareservadapk) {
		this.sillareservadapk = sillareservadapk;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public SillaReservada(SillaReservadaPK sillareservadapk, Cliente cliente) {
		super();
		this.sillareservadapk = sillareservadapk;
		this.cliente = cliente;
	}


	public SillaReservada() {
		super();
	}


	@Override
	public String toString() {
		return "SillaReservada [sillareservadapk=" + sillareservadapk + ", cliente=" + cliente + "]";
	}
	
	
	
	

	
	
}
