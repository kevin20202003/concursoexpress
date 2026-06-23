package com.uisrael.concursoexpress.aplicacion.casosuso.entrada;

import java.util.List;


import com.uisrael.concursoexpress.dominio.entidades.Inscripcion;

public interface IInscripcionUseCase {
	
	Inscripcion guardar(Inscripcion nuevaInscripcion);
	
	Inscripcion buscarPorId (int idInscripcion);
	
	List<Inscripcion> listarTodos();
	
	void eliminar(int idInscripcion);

}
