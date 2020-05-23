package com.dam2.model;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cancion")
public class Cancion {
	
	public String idCanción;
	public File imagen;
	public File letra;
	public LocalDate año_de_lanzamiento;
	public ArrayList<String> idioma;
	public ArrayList<String> instrumentos;
	public String tono;
	public String título;
	public ArrayList<String> género;
	public ArrayList<String> subgénero;
	public String temática_de_la_letra;
	public String época; 
	public ArrayList<String> colaboradores;
	public ArrayList<String> tipo_de_canción;
	public LocalTime duracion;
	public String tonalidad;
	public ArrayList<String> país; 
	public ArrayList<String> autores;
	public ArrayList<String> otros;
	public String idUsuario;
	public File canción;
	
	
	

}
