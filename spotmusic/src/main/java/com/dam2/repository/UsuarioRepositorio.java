package com.dam2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dam2.model.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario,String> {
	

}
