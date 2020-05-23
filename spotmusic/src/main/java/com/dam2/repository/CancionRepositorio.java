package com.dam2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dam2.model.Cancion;

@Repository
public interface CancionRepositorio  extends CrudRepository<Cancion,String> {

}
