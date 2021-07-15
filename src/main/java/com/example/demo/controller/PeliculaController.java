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

import com.example.demo.entidad.Pelicula;
import com.example.demo.repository.IRepositoryPelicula;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PeliculaController {

	@Autowired
	IRepositoryPelicula usandoRepo;

	@GetMapping("/pelicula")
	public List<Pelicula> listarPeliculas() {

		return usandoRepo.findAll();
	}

	@PostMapping("/pelicula")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {

		return usandoRepo.save(pelicula);
	}

	@PutMapping("/pelicula/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name="id")Long id,@RequestBody Pelicula pelicula) {

		pelicula.setIdePelicula(id);
		
		pelicula=usandoRepo.save(pelicula);
		
		return pelicula;
	}
	@DeleteMapping("/pelicula/{id}")
	public void borrarPelicula (@PathVariable(name="id")Long id) {
		usandoRepo.deleteById(id);
		
	}
}
