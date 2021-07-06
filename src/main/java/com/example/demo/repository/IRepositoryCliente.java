package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidad.Cliente;
import com.example.demo.entidad.ClientePK;

@Transactional
public interface IRepositoryCliente extends JpaRepository<Cliente, Long> {

	public void deleteByClientepk(ClientePK clientepk);

}
