package com.example.demo.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@EmbeddedId
	private ClientePK clientepk;

	@Column(name = "NOMBRES")
	private String nombre;

	@Column(name = "APELLIDOS")
	private String apellidos;

	@Column(name = "CLIENTE_ACTIVO")
	private Character clienteActivo;

	public Cliente() {

	}

	public Cliente(ClientePK clientepk, String nombre, String apellidos, Character clienteActivo) {

		this.clientepk = clientepk;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.clienteActivo = clienteActivo;
	}

	public int hashCode() {
		return clientepk.hashCode();
	}

	public boolean equals(Object obj) {
		return clientepk.equals(obj);
	}

	public ClientePK getClientepk() {
		return clientepk;
	}

	public void setClientepk(ClientePK clientepk) {
		this.clientepk = clientepk;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Character getClienteActivo() {
		return clienteActivo;
	}

	public void setClienteActivo(Character clienteActivo) {
		this.clienteActivo = clienteActivo;
	}

}
