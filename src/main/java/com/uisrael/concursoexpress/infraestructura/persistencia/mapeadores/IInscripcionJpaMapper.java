package com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.concursoexpress.dominio.entidades.Inscripcion;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.InscripcionEntity;

@Mapper(componentModel = "spring")
public interface IInscripcionJpaMapper {
	
	Inscripcion toDomain(InscripcionEntity entity);
	
	InscripcionEntity toEntity(Inscripcion inscripcion);

}
