package com.uisrael.concursoexpress.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.IParticipanteUseCase;
import com.uisrael.concursoexpress.dominio.entidades.Participante;
import com.uisrael.concursoexpress.dominio.repositorio.IParticipanteRepositorio;

public class ParticipanteUseCaseImpl implements IParticipanteUseCase{
	
	private final IParticipanteRepositorio repositorio;

	public ParticipanteUseCaseImpl(IParticipanteRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Participante guardar(Participante nuevaParticipante) {
		return repositorio.guardar(nuevaParticipante);
	}

	@Override
	public Participante buscarPorId(int idParticipante) {

		return repositorio.buscarPorId(idParticipante).orElseThrow(()-> new RuntimeException("Participante no encontrada"));
	}

	@Override
	public List<Participante> listarTodos() {
		
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idParticipante) {
		
		repositorio.eliminar(idParticipante);
		
	}

}
