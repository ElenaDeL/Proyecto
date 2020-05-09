package com.dam2.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import nonapi.io.github.classgraph.json.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Empleado {
	
	@Include
	@Id
	//valor max es 0 ya q el long puede ser negativo
	@Min(value=0,message="{empleado.id.mayorquecero}")
	private long id;
	@NotEmpty(message = "{empleado.nombre.confignombre}")
	private String nombre;
	@Email
	@NotEmpty(message = "{empleado.email.configemail}")
	private String email;
	private String telefono;

    //constructores, getters y setters


}