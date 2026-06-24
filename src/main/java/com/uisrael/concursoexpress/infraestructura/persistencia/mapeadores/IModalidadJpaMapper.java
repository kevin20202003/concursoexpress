package com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.concursoexpress.dominio.entidades.Modalidad;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.ModalidadEntity;

@Mapper(componentModel = "spring")
public interface IModalidadJpaMapper {

	Modalidad toDomain(ModalidadEntity entity);

	ModalidadEntity toEntity(Modalidad modalidad);

}
