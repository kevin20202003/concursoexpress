package com.uisrael.concursoexpress.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.concursoexpress.dominio.entidades.Modalidad;
import com.uisrael.concursoexpress.dominio.repositorio.IModalidadRepositorio;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.ModalidadEntity;
import com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores.IModalidadJpaMapper;
import com.uisrael.concursoexpress.infraestructura.repositorio.IModalidadJpaRepositorio;

public class ModalidadRepositorioImpl implements IModalidadRepositorio{
	
	private final IModalidadJpaRepositorio jpaRepositorio;
	private final IModalidadJpaMapper entityMapper;

	public ModalidadRepositorioImpl(IModalidadJpaRepositorio jpaRepositorio, IModalidadJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Modalidad guardar(Modalidad nuevaModalidad) {
		ModalidadEntity entidad = entityMapper.toEntity(nuevaModalidad);
		ModalidadEntity guardado = jpaRepositorio.save(entidad);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Modalidad> buscarPorId(int idModalidad) {
		
		return jpaRepositorio.findById(idModalidad).map(entityMapper::toDomain);
	}

	@Override
	public List<Modalidad> listarTodos() {
		
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idModalidad) {
		
		jpaRepositorio.deleteById(idModalidad);
		
	}

}
