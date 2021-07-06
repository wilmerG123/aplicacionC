package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidad.SillaReservada;
import com.example.demo.entidad.SillaReservadaPK;

@Transactional
public interface IRepositorySillaReservada extends JpaRepository<SillaReservada, Long>{
	
	public void deleteBySillareservadapk(SillaReservadaPK sillapk);

}
