package com.uisrael.concursoexpress.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.concursoexpress.dominio.entidades.Inscripcion;
import com.uisrael.concursoexpress.presentacion.dto.request.InscripcionRequestDto;
import com.uisrael.concursoexpress.presentacion.dto.response.InscripcionResponseDto;

@Mapper(componentModel = "spring")
public interface IInscripcionDtoMapper {
	
	Inscripcion toDomain(InscripcionRequestDto dto);
	InscripcionResponseDto toResponseDto(Inscripcion inscripcionPojo);

}
