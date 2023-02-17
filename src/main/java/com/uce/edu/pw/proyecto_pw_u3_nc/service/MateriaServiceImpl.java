package com.uce.edu.pw.proyecto_pw_u3_nc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Materia;
import com.uce.edu.pw.proyecto_pw_u3_nc.repository.IMateriaRepository;
import com.uce.edu.pw.proyecto_pw_u3_nc.service.to.MateriaTo;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository materiaRepository;
	
	@Override
	public List<MateriaTo> buscarProEstudiante(Integer idEstudiante) {
		// TODO Auto-generated method stub
		List<Materia> lista = this.materiaRepository.buscarProEstudiante(idEstudiante);
		return lista.stream().map(materia -> this.convertir(materia)).collect(Collectors.toList());
	}

	private MateriaTo convertir(Materia materia) {
		MateriaTo materiaTo = new MateriaTo();
		materiaTo.setId(materia.getId());
		materiaTo.setNombre(materia.getNombre());
		materiaTo.setCreditos(materia.getCreditos());
		return materiaTo;
	}

	@Override
	public MateriaTo encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.convertir(this.materiaRepository.encontrar(id));
	}
}
