package com.uisrael.concursoexpress.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.concursoexpress.dominio.entidades.Categoria;
import com.uisrael.concursoexpress.presentacion.dto.request.CategoriaRequestDto;
import com.uisrael.concursoexpress.presentacion.dto.response.CategoriaResponseDto;

@Mapper(componentModel = "spring")
public interface ICategoriaDtoMapper {
	
	Categoria toDomain(CategoriaRequestDto dto);
	CategoriaResponseDto toResponseDto(Categoria categoriaPojo);

}
