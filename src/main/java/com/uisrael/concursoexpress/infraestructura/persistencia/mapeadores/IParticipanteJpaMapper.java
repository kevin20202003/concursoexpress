package com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.concursoexpress.dominio.entidades.Participante;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.ParticipanteEntity;

@Mapper(componentModel = "spring")
public interface IParticipanteJpaMapper {
	
	Participante toDomain(ParticipanteEntity entity);
	
	ParticipanteEntity toEntity(Participante participante);

}
