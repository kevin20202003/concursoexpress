package com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores;

import com.uisrael.concursoexpress.dominio.entidades.Inscripcion;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.InscripcionEntity;

public interface IInscripcionJpaMapper {
	
	Inscripcion toDomain(InscripcionEntity entity);
	
	InscripcionEntity toEntity(Inscripcion inscripcion);

}
