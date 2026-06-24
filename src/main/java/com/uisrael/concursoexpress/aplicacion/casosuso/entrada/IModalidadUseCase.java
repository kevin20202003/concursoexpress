package com.uisrael.concursoexpress.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.concursoexpress.dominio.entidades.Modalidad;

public interface IModalidadUseCase {
	
	Modalidad guardar(Modalidad nuevaModalidad);
	
	Modalidad buscarPorId (int idModalidad);
	
	List<Modalidad> listarTodos();
	
	void eliminar(int idModalidad);

}
