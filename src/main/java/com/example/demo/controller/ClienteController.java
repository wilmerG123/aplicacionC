package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidad.Cliente;
import com.example.demo.entidad.ClientePK;
import com.example.demo.entidad.TipoIdentificacion;
import com.example.demo.repository.IRepositoryCliente;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ClienteController {
	
	@Autowired
	IRepositoryCliente usandoRepo;

	
	@GetMapping("/cliente")
	public List<Cliente> listarClientes (){
		
		return usandoRepo.findAll();
	}
	@PostMapping("/cliente")
	public Cliente guardarCliente (@RequestBody Cliente cliente) {
		
		return usandoRepo.save(cliente);
	}
	@PutMapping("/cliente/{tipoIdentificacion}/{numIdentificacion}")
	public Cliente actualizarCliente (@PathVariable (name="numIdentificacion")Long numIdentificacion, 
			@PathVariable (name="tipoIdentificacion")Long tipoIdentificacion,
			@RequestBody Cliente cliente) {
		
		ClientePK clientepk = new ClientePK();
		
		clientepk.setNumIdentificacion(numIdentificacion);
		
		TipoIdentificacion tipo = new TipoIdentificacion();
		
		tipo.setIdeTipoIdentifiacion(tipoIdentificacion);
		
		clientepk.setTipoIdentificacion(tipo);
		
		cliente.setClientepk(clientepk);
		
		cliente=usandoRepo.save(cliente);
		
		return cliente;
	}

	
	@DeleteMapping("/cliente/{tipoIdentificacion}/{numIdentificacion}")
	public void borrarCliente (@PathVariable(name="numIdentificacion") Long numIdentificacion, 
			@PathVariable (name="tipoIdentificacion")Long tipoIdentificacion) {
		
		ClientePK clientepk = new ClientePK();
		
		clientepk.setNumIdentificacion(numIdentificacion);
		
		TipoIdentificacion tipo = new TipoIdentificacion();
		
		tipo.setIdeTipoIdentifiacion(tipoIdentificacion);
		
		clientepk.setTipoIdentificacion(tipo);
		
		usandoRepo.deleteByClientepk(clientepk);
	}
	 
	
}
