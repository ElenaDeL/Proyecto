package com.dam2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam2.repository.ArtistaReposirtorio;

@Service
public class ArtistaServicio implements IAlbumServicio{
	
	@Autowired 
	ArtistaReposirtorio artistaReposirtorio;

}
