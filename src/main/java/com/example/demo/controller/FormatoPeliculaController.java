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

import com.example.demo.entidad.FormatoPelicula;
import com.example.demo.repository.IRepositoryFormatoPelicula;

@RestController
@RequestMapping("/api")
public class FormatoPeliculaController {

	@Autowired
	IRepositoryFormatoPelicula usandoRepo;

	@GetMapping("/formato")
	public List<FormatoPelicula> listarFormatos() {

		return usandoRepo.findAll();
	}

	@PostMapping("/formato")
	public FormatoPelicula guardarFormato(@RequestBody FormatoPelicula formato) {

		return usandoRepo.save(formato);
	}
	
	@PutMapping("/formato/{id}")
	public FormatoPelicula ActualizarFormato (@PathVariable(name="id")Long id, @RequestBody FormatoPelicula formato) {
		
		formato.setIdeFormatoPelicula(id);
		formato=usandoRepo.save(formato);
		
		return formato;
	}
	
	@DeleteMapping("/formato/{id}")
	public void borrarFormato (@PathVariable(name="id")Long id, @RequestBody FormatoPelicula formato) {
		
		usandoRepo.deleteById(id);
	}

}
