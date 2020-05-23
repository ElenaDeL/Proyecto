package com.dam2.model;

import java.io.File;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode.Include;
import nonapi.io.github.classgraph.json.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Document
public class Album {
	
	@Include
	@Id
	public String idAlbum;
	
	
	
	public String temática_del_album; 
	public int numero_de_canciones;
	public File imagen_del_album;
	public String genero;
	public String subgenero;
	public String título;

}
