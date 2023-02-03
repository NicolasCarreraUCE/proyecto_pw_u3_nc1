package com.uce.edu.pw.proyecto_pw_u3_nc.service;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;

public interface IEstudainteService {

	void registrar(Estudiante estudiante);
	void actualizar(Estudiante estudiante);
	Estudiante encontrar(Integer id);
	void borrar(Integer id);

	Estudiante encontrarEstudiantePorNombre(String nombre);
	Estudiante encontrarEstudiantePorApellido(String apellido);
}
