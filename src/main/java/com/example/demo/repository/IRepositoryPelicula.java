package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidad.Pelicula;

public interface IRepositoryPelicula extends JpaRepository<Pelicula, Long>{

}
