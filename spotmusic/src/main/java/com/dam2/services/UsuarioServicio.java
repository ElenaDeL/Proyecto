package com.dam2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam2.model.Usuario;
import com.dam2.repository.UsuarioRepositorio;

@Service
public class UsuarioServicio implements IUsuarioServicio{
	@Autowired
	public UsuarioRepositorio repositorio;
	
	
	public List<Usuario> vertodas() {
		// TODO Auto-generated method stub
		return (List<Usuario>) repositorio.findAll();
	}

	public void inserUsuario(Usuario x) {
		// TODO Auto-generated method stub
		repositorio.save(x);
	}

}
