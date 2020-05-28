package com.dam2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dam2.model.Usuario;

@Repository
public interface UsuarioRepositorio extends MongoRepository<Usuario,String> {
	

}
