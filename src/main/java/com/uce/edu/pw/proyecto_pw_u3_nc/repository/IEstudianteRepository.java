package com.uce.edu.pw.proyecto_pw_u3_nc.repository;

import java.math.BigDecimal;
import java.util.List;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;

public interface IEstudianteRepository {

	void insertarEstudiante(Estudiante estudainte);
	void actualizarEstudiante(Estudiante estudainte);
	Estudiante consultarEstudiante(Integer id);
	void eliminarEstudiante(Integer id);
	List<Estudiante> buscarTodos();
	List<Estudiante> buscarTodosPorSalario(BigDecimal salario);
}
