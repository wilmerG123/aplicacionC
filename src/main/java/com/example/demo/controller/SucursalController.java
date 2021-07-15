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

import com.example.demo.entidad.Sucursal;
import com.example.demo.repository.IRepositorySucursal;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class SucursalController {

	@Autowired
	IRepositorySucursal usandoRepo;

	@GetMapping("/sucursal")
	public List<Sucursal> listarSucursales() {

		return usandoRepo.findAll();
	}

	@PostMapping("/sucursal")
	public Sucursal guardarSucursal(@RequestBody Sucursal sucursal) {

		return usandoRepo.save(sucursal);
	}
	@PutMapping("/sucursal/{id}")
	public Sucursal actualizarSucursal (@PathVariable(name="id")Long id, @RequestBody Sucursal sucursal) {
		
		sucursal.setIdSucursal(id);
		sucursal=usandoRepo.save(sucursal);
		
		return sucursal;
	}
	
	@DeleteMapping("/sucursal/{id}")
	public void borrarSucursal (@PathVariable(name="id")Long id) {
		usandoRepo.deleteById(id);
	}

}
