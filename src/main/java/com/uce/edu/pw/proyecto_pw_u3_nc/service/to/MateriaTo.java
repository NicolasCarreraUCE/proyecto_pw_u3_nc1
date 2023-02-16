package com.uce.edu.pw.proyecto_pw_u3_nc.service.to;

import org.springframework.hateoas.RepresentationModel;

public class MateriaTo extends RepresentationModel<MateriaTo>{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nombre;
	private Integer creditos;
	
	// SET - GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCreditos() {
		return creditos;
	}
	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}
	
}
