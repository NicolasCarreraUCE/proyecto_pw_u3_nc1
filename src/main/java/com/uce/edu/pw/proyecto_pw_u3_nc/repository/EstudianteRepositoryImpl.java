package com.uce.edu.pw.proyecto_pw_u3_nc.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarEstudiante(Estudiante estudainte) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudainte);
	}

	@Override
	public void actualizarEstudiante(Estudiante estudainte) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudainte);
	}

	@Override
	public Estudiante consultarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void eliminarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.consultarEstudiante(id));
	}

	@Override
	public Estudiante consultarEstudiantePorNombre(String nombre){
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.nombre = :nommbre", Estudiante.class);
		myQuery.setParameter("nombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante consultarEstudiantePorApellido(String apellido){
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :apellido", Estudiante.class);
		myQuery.setParameter("apellido", apellido);
		return myQuery.getSingleResult();
	}

}
