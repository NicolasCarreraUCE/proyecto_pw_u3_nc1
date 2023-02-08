package com.uce.edu.pw.proyecto_pw_u3_nc.repository;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Profesor;

public interface IProfesorRepo {
    void insertarProfesor(Profesor profesor);
	void actualizarProfesor(Profesor profesor);
	Profesor consultarProfesor(Integer id);
	void eliminarProfesor(Integer id);

    Profesor consultaProfesorPorCedula(String cedula);
}
