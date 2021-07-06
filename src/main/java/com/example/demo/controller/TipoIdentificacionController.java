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

import com.example.demo.entidad.TipoIdentificacion;
import com.example.demo.repository.IRepositoryTipoIdentificacion;

@RestController
@RequestMapping("/api")
public class TipoIdentificacionController {

	@Autowired
	IRepositoryTipoIdentificacion usandoRepo;;

	@GetMapping("/tipo")
	public List<TipoIdentificacion> listarTipos() {

		return usandoRepo.findAll();
	}

	@PostMapping("/tipo")
	public TipoIdentificacion guardarTipo(@RequestBody TipoIdentificacion tipo) {

		return usandoRepo.save(tipo);
	}
	@PutMapping("/tipo/{id}")
	public TipoIdentificacion actualizarTipo (@PathVariable(name="id")Long id, @RequestBody TipoIdentificacion tipo) {
		
		tipo.setIdeTipoIdentifiacion(id);
		tipo=usandoRepo.save(tipo);
		return tipo;
	}
	@DeleteMapping("/tipo/{id}")
	public void borrarTipo (@PathVariable(name="id")Long id) {
		usandoRepo.deleteById(id);
	}

}
