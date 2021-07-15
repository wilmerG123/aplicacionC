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

import com.example.demo.entidad.AgendaSalaPelicula;
import com.example.demo.repository.IRepositoryAgendaSalaPelicula;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AgendaSalaPeliculaController {
	
	
	@Autowired
	IRepositoryAgendaSalaPelicula usandoRepo;
	
	@GetMapping("/agenda")
	public List<AgendaSalaPelicula> listarAgendaSala (){
		
		return usandoRepo.findAll();
	}
	@PostMapping("/agenda")
	public AgendaSalaPelicula guardarAgendaSalaPelicula (@RequestBody AgendaSalaPelicula agenda) {
		
		return usandoRepo.save(agenda);
	}
	
	@PutMapping("/agenda/{id}")
	public AgendaSalaPelicula actualizarAgendaSalaPelicula(@PathVariable(name="id")Long id,@RequestBody AgendaSalaPelicula agenda) {
		
		agenda.setIdeAgendaSalaPelicula(id);
		agenda= usandoRepo.save(agenda);
		
		return agenda;
	}
	
	@DeleteMapping("/agenda/{id}")
	
	public void borrarAgenda (@PathVariable(name = "id")Long id) {
		
		usandoRepo.deleteById(id);
	}
	

}
