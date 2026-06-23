package com.uisrael.concursoexpress.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.concursoexpress.dominio.entidades.Modalidad;

public interface IModalidadRepositorio {
	
	Modalidad guardar(Modalidad nuevaModalidad);
	
	Optional<Modalidad> buscarPorId (int idModalidad);
	
	List<Modalidad> listarTodos();
	
	void eliminar(int idModalidad);

}
