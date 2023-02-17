package com.uce.edu.pw.proyecto_pw_u3_nc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;
import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepositoryImpl implements IMateriaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Materia> buscarProEstudiante(Integer idEstudiante) {
		// TODO Auto-generated method stub
		TypedQuery<Materia> myQuery = this.entityManager.createQuery("SELECT m FROM Materia m WHERE m.estudiante.id = :idEstudiante", Materia.class);
		myQuery.setParameter("idEstudiante", idEstudiante);
		return myQuery.getResultList();
	}

	@Override
	public Materia encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Materia.class, id);
	}
	
	
}
