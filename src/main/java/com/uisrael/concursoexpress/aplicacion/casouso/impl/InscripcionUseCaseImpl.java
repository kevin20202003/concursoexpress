package com.uisrael.concursoexpress.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.IInscripcionUseCase;
import com.uisrael.concursoexpress.dominio.entidades.Inscripcion;
import com.uisrael.concursoexpress.dominio.repositorio.IInscripcionRepositorio;

public class InscripcionUseCaseImpl implements IInscripcionUseCase{
	
	private final IInscripcionRepositorio repositorio;

	public InscripcionUseCaseImpl(IInscripcionRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Inscripcion guardar(Inscripcion nuevaInscripcion) {
		
		return repositorio.guardar(nuevaInscripcion);
	}

	@Override
	public Inscripcion buscarPorId(int idInscripcion) {
		
		return repositorio.buscarPorId(idInscripcion).orElseThrow(()-> new RuntimeException("Inscripcion no encontrada"));

	}

	@Override
	public List<Inscripcion> listarTodos() {
		
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idInscripcion) {
		
		repositorio.eliminar(idInscripcion);
		
	}

}
