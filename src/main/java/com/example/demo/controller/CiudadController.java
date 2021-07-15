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

import com.example.demo.entidad.Ciudad;
import com.example.demo.repository.IRepositoryCiudad;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CiudadController {

	@Autowired
	IRepositoryCiudad usandoRepo;

	@GetMapping("/ciudad")
	public List<Ciudad> listarCiudades() {

		return usandoRepo.findAll();
	}

	@PostMapping("/ciudad")
	public Ciudad guardarCiudad(@RequestBody Ciudad ciudad) {

		return usandoRepo.save(ciudad);
	}
	@PutMapping("/ciudad/{id}")
	public Ciudad actualizarCiudad(@PathVariable(name="id")Long id, @RequestBody Ciudad ciudad) {
		
		ciudad.setIdeCiudad(id);
		ciudad=usandoRepo.save(ciudad);
		return ciudad;
	}
	
	@DeleteMapping("/ciudad/{id}")
	public void borrarCiudad (@PathVariable(name="id")Long id) {
		usandoRepo.deleteById(id);
	}

}
