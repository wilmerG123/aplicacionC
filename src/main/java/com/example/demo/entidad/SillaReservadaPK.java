package com.example.demo.entidad;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class SillaReservadaPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@ManyToOne
	@JoinColumn(name = "IDE_AGENDA_SALA_PELICULA")
	private AgendaSalaPelicula agenda;
	
	
	@Column(name = "SILLA")
	private String silla;
	
	@Column(name = "FECHA")
	private Date fecha;

	public SillaReservadaPK(AgendaSalaPelicula agenda, String silla, Date fecha) {
		
		this.agenda = agenda;
		this.silla = silla;
		this.fecha = fecha;
	}

	public SillaReservadaPK() {
		
	}

	@Override
	public String toString() {
		return "SillaReservadaPK [agenda=" + agenda + ", silla=" + silla + ", fecha=" + fecha + "]";
	}

	public AgendaSalaPelicula getAgenda() {
		return agenda;
	}

	public void setAgenda(AgendaSalaPelicula agenda) {
		this.agenda = agenda;
	}

	public String getSilla() {
		return silla;
	}

	public void setSilla(String silla) {
		this.silla = silla;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
	
	
}
