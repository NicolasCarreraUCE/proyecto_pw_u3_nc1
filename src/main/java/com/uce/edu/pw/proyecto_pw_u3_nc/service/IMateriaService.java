package com.uce.edu.pw.proyecto_pw_u3_nc.service;

import java.util.List;

import com.uce.edu.pw.proyecto_pw_u3_nc.service.to.MateriaTo;

public interface IMateriaService {

	MateriaTo encontrar(Integer id);
	List<MateriaTo> buscarProEstudiante(Integer idEstudiante);
}
