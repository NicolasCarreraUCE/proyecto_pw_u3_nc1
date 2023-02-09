package com.uce.edu.pw.proyecto_pw_u3_nc.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;
import com.uce.edu.pw.proyecto_pw_u3_nc.repository.IEstudianteRepository;

@Service
public class EstudainteServiceImpl implements IEstudainteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	@Override
	public void registrar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertarEstudiante(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizarEstudiante(estudiante);
	}

	@Override
	public Estudiante encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.consultarEstudiante(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminarEstudiante(id);
	}

	@Override
	public List<Estudiante> encontrarTodos(){
		return this.estudianteRepository.buscarTodos();
	}

	@Override
	public List<Estudiante> encontrarTodosPorSalario(BigDecimal salario){
		return this.estudianteRepository.buscarTodosPorSalario(salario);
	}

}
