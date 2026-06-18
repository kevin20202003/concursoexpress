package com.uisrael.concursoexpress.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.ParticipanteEntity;

public interface IParticipanteRepositorio extends JpaRepository<ParticipanteEntity, Integer>{
	
	

}
