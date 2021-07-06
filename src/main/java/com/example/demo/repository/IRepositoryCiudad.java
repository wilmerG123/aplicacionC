package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.Ciudad;

@Repository
public interface IRepositoryCiudad extends JpaRepository<Ciudad, Long>{

}
