package com.dam2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam2.repository.AlbumRepositorio;

@Service
public class AlbumServicio implements IAlbumServicio{
	
	@Autowired
	AlbumRepositorio albumRepositorio;

}
