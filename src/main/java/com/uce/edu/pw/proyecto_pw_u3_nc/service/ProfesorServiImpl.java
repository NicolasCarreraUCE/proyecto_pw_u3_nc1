package com.uce.edu.pw.proyecto_pw_u3_nc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Profesor;
import com.uce.edu.pw.proyecto_pw_u3_nc.repository.IProfesorRepo;

@Service
public class ProfesorServiImpl implements IProfesorServi {

    @Autowired
    private IProfesorRepo profesorRepo;

    @Override
    public void registrar(Profesor profesor) {
        // TODO Auto-generated method stub
        this.profesorRepo.insertarProfesor(profesor);
    }

    @Override
    public void actualizar(Profesor profesor) {
        // TODO Auto-generated method stub
        this.profesorRepo.actualizarProfesor(profesor);
    }

    @Override
    public Profesor encontrar(Integer id) {
        // TODO Auto-generated method stub
        return this.profesorRepo.consultarProfesor(id);
    }

    @Override
    public void borrar(Integer id) {
        // TODO Auto-generated method stub
        this.profesorRepo.eliminarProfesor(id);
    }

    @Override
    public Profesor encontrarPorCedula(String cedula) {
        // TODO Auto-generated method stub
        return this.profesorRepo.consultaProfesorPorCedula(cedula);
    }

}
