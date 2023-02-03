package com.uce.edu.pw.proyecto_pw_u3_nc.repository;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;

public interface IEstudianteRepository {

	void insertarEstudiante(Estudiante estudainte);
	void actualizarEstudiante(Estudiante estudainte);
	Estudiante consultarEstudiante(Integer id);
	void eliminarEstudiante(Integer id);

	Estudiante consultarEstudiantePorNombre(String nombre);
	Estudiante consultarEstudiantePorApellido(String apellido);
	
}
