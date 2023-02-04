package com.uce.edu.pw.proyecto_pw_u3_nc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;
import com.uce.edu.pw.proyecto_pw_u3_nc.service.IEstudainteService;

@RestController
@RequestMapping("/estudaintes")
public class EstudianteControllerRestFull {

    @Autowired
    private IEstudainteService estudainteService;
	
	@PostMapping
    public void registrar(Estudiante estudiante) {
		// TODO Auto-generated method stub
	}

	@PutMapping(path = "/{id}")
    public void actualizar(@PathVariable("id") Estudiante estudiante) {
		// TODO Auto-generated method stub
	}

	@PutMapping
    public void actualizarTodos(Estudiante estudiante) {
		// TODO Auto-generated method stub
	}

    @GetMapping(path = "/{id}")
	public Estudiante encontrar(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
        return this.estudainteService.encontrar(id);
	}

	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		this.estudainteService.borrar(id);
	}

	@DeleteMapping
	public void borrarTodos(Integer id) {
		// TODO Auto-generated method stub
	}
}
