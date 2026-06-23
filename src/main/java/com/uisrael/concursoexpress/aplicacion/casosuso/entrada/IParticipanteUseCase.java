package com.uisrael.concursoexpress.aplicacion.casosuso.entrada;

import java.util.List;


import com.uisrael.concursoexpress.dominio.entidades.Participante;

public interface IParticipanteUseCase {
	
	Participante guardar(Participante nuevaParticipante);
	
	Participante buscarPorId (int idParticipante);
	
	List<Participante> listarTodos();
	
	void eliminar(int idParticipante);

}
