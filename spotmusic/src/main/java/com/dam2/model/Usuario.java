package com.dam2.model;

import java.io.File;
import java.time.LocalDate;
import java.util.Objects;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import nonapi.io.github.classgraph.json.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Document
public class Usuario {
	
	
	@Include
	@Id
	public String id;
	public String nombre;
	public String email;
//	public String contraseña;
//	public File imagen;
//	public String nombre_cuenta;
//	public String apellido;
//	public String país;
//	public LocalDate fecha_nacimiento;

	
	

}



