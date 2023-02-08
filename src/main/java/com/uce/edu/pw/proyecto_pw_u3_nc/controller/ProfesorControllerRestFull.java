package com.uce.edu.pw.proyecto_pw_u3_nc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Profesor;
import com.uce.edu.pw.proyecto_pw_u3_nc.service.IProfesorServi;

@RestController
@RequestMapping("/profesores")
public class ProfesorControllerRestFull {
    
    @Autowired
    private IProfesorServi profesorServi;

    @GetMapping(path = "/{id}")
	public Profesor encontrar(@PathVariable("id") Integer id) {
        return this.profesorServi.encontrar(id);
    }

    @GetMapping(path = "/cedula/{cedula}")
    public Profesor encontrarPorCedula(@PathVariable("cedula") String cedula) {
        return this.profesorServi.encontrarPorCedula(cedula);
    }

    @DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
        this.profesorServi.borrar(id);
    }
}
