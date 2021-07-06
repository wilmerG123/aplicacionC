package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidad.TipoIdentificacion;

public interface IRepositoryTipoIdentificacion extends JpaRepository<TipoIdentificacion, Long>{

}
