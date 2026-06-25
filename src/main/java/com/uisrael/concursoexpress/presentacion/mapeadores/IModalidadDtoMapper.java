package com.uisrael.concursoexpress.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.concursoexpress.dominio.entidades.Modalidad;
import com.uisrael.concursoexpress.presentacion.dto.request.ModalidadRequestDto;
import com.uisrael.concursoexpress.presentacion.dto.response.ModalidadResponseDto;

@Mapper(componentModel = "spring")
public interface IModalidadDtoMapper {
	
	Modalidad toDomain(ModalidadRequestDto dto);
	ModalidadResponseDto toResponseDto(Modalidad modalidadPojo);

}
