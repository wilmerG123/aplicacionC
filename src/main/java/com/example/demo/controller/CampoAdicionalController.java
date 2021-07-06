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

import com.example.demo.entidad.CampoAdicional;
import com.example.demo.repository.IRepositoryCampoAdicional;

@RestController
@RequestMapping("/api")
public class CampoAdicionalController {

	@Autowired
	IRepositoryCampoAdicional usandoRepo;

	@GetMapping("/campo")
	public List<CampoAdicional> listarCampos() {

		return usandoRepo.findAll();
	}

	@PostMapping("/campo")
	public CampoAdicional guardarCampo(@RequestBody CampoAdicional campo) {

		return usandoRepo.save(campo);
	}

	@PutMapping("/campo/{id}")
	public CampoAdicional actualizarCampo(@PathVariable(name = "id")Long id,@RequestBody CampoAdicional campo) {

		campo.setIdeCampoAdicional(id);
		campo=usandoRepo.save(campo);
		
		return campo;
	}

	@DeleteMapping("/campo/{id}")

	public void borrarCampoAdicional(@PathVariable(name = "id") Long id) {
		
		usandoRepo.deleteById(id);
	}

}
