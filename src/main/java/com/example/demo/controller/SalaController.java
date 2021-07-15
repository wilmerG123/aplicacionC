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

import com.example.demo.entidad.Sala;
import com.example.demo.repository.IRepositorySala;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class SalaController {

	@Autowired
	IRepositorySala usandoRepo;

	@GetMapping("/sala")
	public List<Sala> listarSalas() {

		return usandoRepo.findAll();
	}

	@PostMapping("/sala")
	public Sala guardarSala(@RequestBody Sala sala) {

		return usandoRepo.save(sala);
	}
	@PutMapping("/sala/{id}")
	public Sala actualizarSala (@PathVariable(name="id")Long id,@RequestBody Sala sala) {
		
		sala.setIdeSala(id);
		sala=usandoRepo.save(sala);
		return sala;
		
	}
	@DeleteMapping("/sala/{id}")
	public void borrarSala (@PathVariable(name="id")Long id) {
		usandoRepo.deleteById(id);
	}

}
