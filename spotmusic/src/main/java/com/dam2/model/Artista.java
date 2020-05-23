package com.dam2.model;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

@Document
public class Artista extends Usuario {

	
	public String descripción;
	public ArrayList <String>enlaces;
	public boolean compositor;
	public boolean intérprete;
	public boolean proyecto;
	public String email_comercial;
	public ArrayList <String> tipo_musico;
}
