package com.uce.edu.pw.proyecto_pw_u3_nc.service;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Profesor;

public interface IProfesorServi {
    void registrar(Profesor profesor);
	void actualizar(Profesor profesor);
	Profesor encontrar(Integer id);
	void borrar(Integer id);

    Profesor encontrarPorCedula(String cedula);
}
