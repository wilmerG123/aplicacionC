package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.AgendaSalaPelicula;
@Repository
public interface IRepositoryAgendaSalaPelicula extends JpaRepository<AgendaSalaPelicula, Long>{

}
