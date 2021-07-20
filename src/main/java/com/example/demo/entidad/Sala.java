package com.example.demo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sala")
public class Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDE_SALA")
	private Long ideSala;
	
	@ManyToOne
	@JoinColumn(name="IDE_SUCURSAL")
	private Sucursal sucursal;
	
	@ManyToOne
	@JoinColumn(name="IDE_FORMATO_PELICULA")
	private FormatoPelicula formato;
	
	
	
	@Column(name="NUM_FILAS")
	private Integer numFilas;
	@Column(name="NUM_MAX_SILLAS_POR_FILA")
	private Integer numMaxSillasPorFila;
	public Long getIdeSala() {
		return ideSala;
	}
	public void setIdeSala(Long ideSala) {
		this.ideSala = ideSala;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public FormatoPelicula getFormato() {
		return formato;
	}
	public void setFormato(FormatoPelicula formato) {
		this.formato = formato;
	}
	public Integer getNumFilas() {
		return numFilas;
	}
	public void setNumFilas(Integer numFilas) {
		this.numFilas = numFilas;
	}
	public Integer getNumMaxSillasPorFila() {
		return numMaxSillasPorFila;
	}
	public void setNumMaxSillasPorFila(Integer numMaxSillasPorFila) {
		this.numMaxSillasPorFila = numMaxSillasPorFila;
	}
	public Sala(Long ideSala, Sucursal sucursal, FormatoPelicula formato, Integer numFilas,
			Integer numMaxSillasPorFila) {
		
		this.ideSala = ideSala;
		this.sucursal = sucursal;
		this.formato = formato;
		this.numFilas = numFilas;
		this.numMaxSillasPorFila = numMaxSillasPorFila;
	}
	public Sala() {

	}
	@Override
	public String toString() {
		return "Sala [ideSala=" + ideSala + ", sucursal=" + sucursal + ", formato=" + formato + ", numFilas=" + numFilas
				+ ", numMaxSillasPorFila=" + numMaxSillasPorFila + "]";
	}
	
}
