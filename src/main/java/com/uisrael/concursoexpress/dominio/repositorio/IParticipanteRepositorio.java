package com.uisrael.concursoexpress.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.concursoexpress.dominio.entidades.Participante;

public interface IParticipanteRepositorio {
	
	Participante guardar(Participante nuevaParticipante);
	
	Optional<Participante> buscarPorId (int idParticipante);
	
	List<Participante> listarTodos();
	
	void eliminar(int idParticipante);

}
