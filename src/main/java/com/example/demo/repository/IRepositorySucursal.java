package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidad.Sucursal;

public interface IRepositorySucursal extends JpaRepository<Sucursal, Long>{

}
