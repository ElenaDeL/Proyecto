package com.dam2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam2.repository.CancionRepositorio;

@Service
public class CancionServicio implements ICancionServicio{
	@Autowired
	CancionRepositorio cancionRepositorio;

}
