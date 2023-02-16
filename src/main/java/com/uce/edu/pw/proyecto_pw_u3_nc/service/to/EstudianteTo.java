package com.uce.edu.pw.proyecto_pw_u3_nc.service.to;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

public class EstudianteTo extends RepresentationModel<EstudianteTo> {

	// Objeto transferido por la Red en el caso de clases planas
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nombre;
	private String apellido;
	private LocalDateTime fechaNacimiento;
	private List<MateriaTo> materias;
	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public List<MateriaTo> getMaterias() {
		return materias;
	}
	public void setMaterias(List<MateriaTo> materias) {
		this.materias = materias;
	}
	
}
