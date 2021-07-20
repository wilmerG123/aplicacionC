package com.example.demo.entidad;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sucursal")

public class Sucursal {

	

	@Id
	@Column(name = "ID_SUCURSAL")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSucursal;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "DIRECCION")
	private String direccion;
	@Column(name = "ID_ADMINISTRADOR")
	private Integer idAdministrador;

	@ManyToOne
	@JoinColumn(name = "IDE_CIUDAD")
	private Ciudad ciudad;

	public Long getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Long idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(Integer idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Sucursal(Long idSucursal, String nombre, String direccion, Integer idAdministrador, Ciudad ciudad,
			List<Pelicula> peliculasPermitidas) {

		this.idSucursal = idSucursal;
		this.nombre = nombre;
		this.direccion = direccion;
		this.idAdministrador = idAdministrador;
		this.ciudad = ciudad;

	}

	public Sucursal() {

	}

	@Override
	public String toString() {
		return "Sucursal [idSucursal=" + idSucursal + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", idAdministrador=" + idAdministrador + ", ciudad=" + ciudad + "]";
	}

}
