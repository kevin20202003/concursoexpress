package com.uisrael.concursoexpress.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.concursoexpress.dominio.entidades.Participante;
import com.uisrael.concursoexpress.presentacion.dto.request.ParticipanteRequestDto;
import com.uisrael.concursoexpress.presentacion.dto.response.ParticipanteResponseDto;

@Mapper(componentModel = "spring")
public interface IParticipanteDtoMapper {
	
	Participante toDomain(ParticipanteRequestDto dto);
	ParticipanteResponseDto toResponseDto(Participante participantePojo);

}
