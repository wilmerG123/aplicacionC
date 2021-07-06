package com.example.demo.controller;

import java.sql.Date;
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

import com.example.demo.entidad.AgendaSalaPelicula;
import com.example.demo.entidad.SillaReservada;
import com.example.demo.entidad.SillaReservadaPK;
import com.example.demo.repository.IRepositorySillaReservada;

@RestController
@RequestMapping("/api")
public class SillaReservadaController {

	@Autowired
	IRepositorySillaReservada usandoRepo;

	@GetMapping("/silla")
	public List<SillaReservada> listarSillas() {

		return usandoRepo.findAll();
	}

	@PostMapping("/silla")
	public SillaReservada guardarSillaReservada(@RequestBody SillaReservada silla) {

		return usandoRepo.save(silla);
	}
	
	
	@PutMapping("/silla/{ideAgendaSalaPelicula}/{silla}/{fecha}")
	public SillaReservada actualizarSilla (@PathVariable(name="ideAgendaSalaPelicula")Long ideAgendaSalaPelicula,
			@PathVariable(name="silla")String silla,
			@PathVariable(name="fecha")Date fecha,
			@RequestBody SillaReservada sillareservada) {
		
		AgendaSalaPelicula agenda = new AgendaSalaPelicula();
		agenda.setIdeAgendaSalaPelicula(ideAgendaSalaPelicula);
		
		SillaReservadaPK sillapk = new SillaReservadaPK();
		
		sillapk.setAgenda(agenda);
		sillapk.setFecha(fecha);
		sillapk.setSilla(silla);

		sillareservada.setSillareservadapk(sillapk);
		sillareservada=usandoRepo.save(sillareservada);
		
		return sillareservada;
		
	}
	@DeleteMapping("/silla/{ideAgendaSalaPelicula}/{silla}/{fecha}")
	public void borrarSillaReservada (@PathVariable(name="ideAgendaSalaPelicula")Long ideAgendaSalaPelicula,
			@PathVariable(name="silla")String silla,
			@PathVariable(name="fecha")Date fecha) {
		
		AgendaSalaPelicula agenda = new AgendaSalaPelicula();
		agenda.setIdeAgendaSalaPelicula(ideAgendaSalaPelicula);
		
		SillaReservadaPK sillapk = new SillaReservadaPK();
		
		sillapk.setAgenda(agenda);
		sillapk.setFecha(fecha);
		sillapk.setSilla(silla);
		
		usandoRepo.deleteBySillareservadapk(sillapk);
		
		
	}
	
	
	
}
