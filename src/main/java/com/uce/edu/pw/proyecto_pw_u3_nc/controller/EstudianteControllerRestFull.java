package com.uce.edu.pw.proyecto_pw_u3_nc.controller;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
import com.uce.edu.pw.proyecto_pw_u3_nc.service.IMateriaService;
import com.uce.edu.pw.proyecto_pw_u3_nc.service.to.EstudianteTo;
import com.uce.edu.pw.proyecto_pw_u3_nc.service.to.MateriaTo;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/estudaintes")
public class EstudianteControllerRestFull {

    @Autowired
    private IEstudainteService estudainteService;
	
    @Autowired
    private IMateriaService materiaService;
    
	@PostMapping
    public void registrar(@RequestBody Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudainteService.registrar(estudiante);
	}

//	@PutMapping(path = "/{id}", consumes = (MediaType.APPLICATION_JSON_VALUE))
//    public void actualizar(@PathVariable("id") Integer id , @RequestBody Estudiante estudiante) {
//		// TODO Auto-generated method stub
//		this.estudainteService.actualizar(estudiante);
//	}

	@PutMapping(path = "/provincia", consumes = (MediaType.APPLICATION_JSON_VALUE))
    public void actualizarProvincia(@RequestBody Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudainteService.actualizar(estudiante);
	}

	@PutMapping(path = "/{id}", consumes = (MediaType.APPLICATION_JSON_VALUE), produces = (MediaType.APPLICATION_XML_VALUE))
    public ResponseEntity<Estudiante> actualizar(@PathVariable("id") Integer id , @RequestBody Estudiante estudiante) {
		// TODO Auto-generated method stub
		estudiante.setId(id);
		this.estudainteService.actualizar(estudiante);
		Estudiante est = this.estudainteService.encontrar(id);
		return ResponseEntity.status(HttpStatus.OK).body(est); 
		
	}
	
	@PutMapping
    public void actualizarTodos(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}

    @GetMapping(path = "/{id}", produces = (MediaType.APPLICATION_JSON_VALUE))
	public ResponseEntity<Estudiante> encontrar(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
    	Estudiante estudiante = this.estudainteService.encontrar(id);
    	int codigoMensaje = 0;
    	if (true) {
			codigoMensaje = 230;
			return ResponseEntity.status(codigoMensaje).body(estudiante); 
		}
    	return ResponseEntity.ok(estudiante);
//    	return ResponseEntity.status(227).body(estudiante); 
//    	return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(estudiante); 
	}

//	@GetMapping
//	public ResponseEntity<List<Estudiante>> encontrarTodos() {
//		// TODO Auto-generated method stub
//    	HttpHeaders cabeceras = new HttpHeaders();
//    	cabeceras.add("detalleMensaje", "Estudaine encontrado correctacmente");
//    	cabeceras.add("valorCalculado", "100");
//		List<Estudiante> lista = this.estudainteService.encontrarTodos();
//    	return new ResponseEntity<>(lista, cabeceras, 230);
//	}

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
	
	
	@GetMapping(produces = (MediaType.APPLICATION_JSON_VALUE))
	public ResponseEntity<List<EstudianteTo>> encontrarTodosHateoas(){
		List<EstudianteTo> lista = this.estudainteService.encontrarTodosTo();
		for(EstudianteTo estu: lista) {
			Link myLink = linkTo(methodOn(EstudianteControllerRestFull.class).buscarMaterias(estu.getId())).withRel("materias");
			Link myLink2 = linkTo(methodOn(EstudianteControllerRestFull.class).encontrar(estu.getId())).withSelfRel();
			Link myLink3 = linkTo(EstudianteControllerRestFull.class).slash("prueba").slash("estudainte").slash(estu.getId()).slash("final").withRel("enlacePrueba");
					
			estu.add(myLink);
			estu.add(myLink2);
			estu.add(myLink3);
		}
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	
	@GetMapping(path = "/{idEstudainte}/materias", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MateriaTo> buscarMaterias(@PathVariable("idEstudainte") Integer idEsInteger) {
		List<MateriaTo> lista = this.materiaService.buscarProEstudiante(idEsInteger);
		for(MateriaTo mate: lista) {
			Link myLink = linkTo(methodOn(EstudianteControllerRestFull.class).encontrar(mate.getId())).withSelfRel();
			mate.add(myLink);
		}
		return lista;
	}
	
	@GetMapping(path = "materia/{id}", produces = (MediaType.APPLICATION_JSON_VALUE))
	public ResponseEntity<MateriaTo> encontrarMateria(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
    	MateriaTo materiaTo = this.materiaService.encontrar(id);
    	return ResponseEntity.status(HttpStatus.OK).body(materiaTo); 

	}
}

