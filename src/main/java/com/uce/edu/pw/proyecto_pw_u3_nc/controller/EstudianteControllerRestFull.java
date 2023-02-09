package com.uce.edu.pw.proyecto_pw_u3_nc.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;
import com.uce.edu.pw.proyecto_pw_u3_nc.service.IEstudainteService;

@RestController
@RequestMapping("/estudaintes")
public class EstudianteControllerRestFull {

    @Autowired
    private IEstudainteService estudainteService;
	
	@PostMapping
    public void registrar(@RequestBody Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudainteService.registrar(estudiante);
	}

	@PutMapping(path = "/{id}")
    public void actualizar(@PathVariable("id") Integer id , @RequestBody Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudainteService.actualizar(estudiante);
	}

	@PutMapping(path = "/provincia")
    public void actualizarProvincia(@RequestBody Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudainteService.actualizar(estudiante);
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

	@GetMapping
	public List<Estudiante> encontrarTodos() {
		// TODO Auto-generated method stub
        return this.estudainteService.encontrarTodos();
	}

	@GetMapping(path = "/salario")
	public List<Estudiante> encontrarTodosPorSalerio(@RequestParam("salario") BigDecimal salario) {
		// TODO Auto-generated method stub
        return this.estudainteService.encontrarTodosPorSalario(salario);
	}

	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		this.estudainteService.borrar(id);
	}

	@PostMapping(path = "/borrar/{id}")
	public void borrarTmp(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		this.estudainteService.borrar(id);
	}

	@DeleteMapping
	public void borrarTodos(Integer id) {
		// TODO Auto-generated method stub
	}
}
