package com.uisrael.concursoexpress.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.IModalidadUseCase;
import com.uisrael.concursoexpress.dominio.entidades.Modalidad;
import com.uisrael.concursoexpress.dominio.repositorio.IModalidadRepositorio;

public class ModalidadUseCaseImpl implements IModalidadUseCase{
	
	private final IModalidadRepositorio repositorio;

	public ModalidadUseCaseImpl(IModalidadRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Modalidad guardar(Modalidad nuevaModalidad) {
		
		return repositorio.guardar(nuevaModalidad);
	}

	@Override
	public Modalidad buscarPorId(int idModalidad) {
	
		return repositorio.buscarPorId(idModalidad).orElseThrow(()-> new RuntimeException("Modalidad no encontrada"));
	}

	@Override
	public List<Modalidad> listarTodos() {

		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idModalidad) {
		
		repositorio.eliminar(idModalidad);

		
	}

}
