package com.uce.edu.pw.proyecto_pw_u3_nc.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.pw.proyecto_pw_u3_nc.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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
	public List<Estudiante> buscarTodos(){
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarTodosPorSalario(BigDecimal salario){
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.salario <= :salario", Estudiante.class);
		myQuery.setParameter("salario", salario);
		return myQuery.getResultList();
	}
}
