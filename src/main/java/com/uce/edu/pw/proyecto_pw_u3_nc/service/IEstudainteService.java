package com.uce.edu.pw.proyecto_pw_u3_nc.service;

import java.math.BigDecimal;
import java.util.List;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;

public interface IEstudainteService {

	void registrar(Estudiante estudiante);
	void actualizar(Estudiante estudiante);
	Estudiante encontrar(Integer id);
	void borrar(Integer id);
	List<Estudiante> encontrarTodos();
	List<Estudiante> encontrarTodosPorSalario(BigDecimal salario);
}
