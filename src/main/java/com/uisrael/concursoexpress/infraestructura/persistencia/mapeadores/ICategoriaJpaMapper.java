package com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.concursoexpress.dominio.entidades.Categoria;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.CategoriaEntity;

@Mapper(componentModel = "spring")
public interface ICategoriaJpaMapper {
	
	Categoria toDomain(CategoriaEntity entity);
	
	CategoriaEntity toEntity(Categoria categoria);

}
