package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidad.GeneroPelicula;
import com.example.demo.repository.IRepositoryGeneroPelicula;

@RestController
@RequestMapping("/api")
public class GeneroPeliculaController {

	@Autowired
	IRepositoryGeneroPelicula usandoRepo;

	@GetMapping("/genero")
	public List<GeneroPelicula> listarGeneros() {

		return usandoRepo.findAll();
	}
	@PostMapping("/genero")
	public GeneroPelicula guardarGenero (@RequestBody GeneroPelicula genero) {
		
		return usandoRepo.save(genero);
	}
	@PutMapping("/genero/{id}")
	public GeneroPelicula actualizarPelicula (@PathVariable(name="id")Long id, @RequestBody GeneroPelicula genero) {
		
		genero.setIdeGeneroPelicula(id);
		genero=usandoRepo.save(genero);
		
		return genero;
	}
	@DeleteMapping("/genero/{id}")
	public void borrargenero (@PathVariable(name="id")Long id) {
		
		usandoRepo.deleteById(id);
	}
	
}
