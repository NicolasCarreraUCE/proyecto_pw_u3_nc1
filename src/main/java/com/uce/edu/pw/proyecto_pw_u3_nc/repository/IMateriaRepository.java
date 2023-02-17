package com.uce.edu.pw.proyecto_pw_u3_nc.repository;

import java.util.List;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Materia;

public interface IMateriaRepository {

	Materia encontrar(Integer id);
	List<Materia> buscarProEstudiante(Integer idEstudiante);
}
