package com.example.demo.entidad;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AGENDA_SALA_PELICULA")
public class AgendaSalaPelicula {

	@Id
	@Column(name = "IDE_AGENDA_SALA_PELICULA")
	private Long ideAgendaSalaPelicula;

	@ManyToOne
	@JoinColumn(name = "IDE_SALA")
	private Sala sala;

	@ManyToOne
	@JoinColumn(name = "IDE_PELICULA")
	private Pelicula pelicula;

	@Column(name = "HORA_PRESENTACION")
	private Date horaPresentacion;

	public Long getIdeAgendaSalaPelicula() {
		return ideAgendaSalaPelicula;
	}

	public void setIdeAgendaSalaPelicula(Long ideAgendaSalaPelicula) {
		this.ideAgendaSalaPelicula = ideAgendaSalaPelicula;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Date getHoraPresentacion() {
		return horaPresentacion;
	}

	public void setHoraPresentacion(Date horaPresentacion) {
		this.horaPresentacion = horaPresentacion;
	}

	public AgendaSalaPelicula(Long ideAgendaSalaPelicula, Sala sala, Pelicula pelicula, Date horaPresentacion) {

		this.ideAgendaSalaPelicula = ideAgendaSalaPelicula;
		this.sala = sala;
		this.pelicula = pelicula;
		this.horaPresentacion = horaPresentacion;
	}

	public AgendaSalaPelicula() {

	}

	@Override
	public String toString() {
		return "AgendaSalaPelicula [ideAgendaSalaPelicula=" + ideAgendaSalaPelicula + ", sala=" + sala + ", pelicula="
				+ pelicula + ", horaPresentacion=" + horaPresentacion + "]";
	}

}
