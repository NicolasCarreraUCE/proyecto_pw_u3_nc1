package com.uce.edu.pw.proyecto_pw_u3_nc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;
import com.uce.edu.pw.proyecto_pw_u3_nc.service.IEstudainteService;

@RestController
@RequestMapping("/estudainte")
public class EstudianteControllerRestFull {

    @Autowired
    private IEstudainteService estudainteService;
	
    public void registrar(Estudiante estudiante) {
		// TODO Auto-generated method stub
	}

    public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
	}

    @GetMapping(path = "/buscar/{id}")
	public Estudiante encontrar(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
        return this.estudainteService.encontrar(id);
	}

	public void borrar(Integer id) {
		// TODO Auto-generated method stub
	}
}
