package com.dam2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dam2.model.Playlist;

@Repository
public interface PlaylistRepositorio extends CrudRepository<Playlist,String> {

}
