package com.uisrael.concursoexpress.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.concursoexpress.dominio.entidades.Inscripcion;

public interface IInscripcionRepositorio {
	
	Inscripcion guardar(Inscripcion nuevaInscripcion);
	
	Optional<Inscripcion> buscarPorId (int idInscripcion);
	
	List<Inscripcion> listarTodos();
	
	void eliminar(int idInscripcion);

}
