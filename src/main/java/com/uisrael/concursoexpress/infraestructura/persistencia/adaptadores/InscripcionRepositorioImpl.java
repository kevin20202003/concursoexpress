package com.uisrael.concursoexpress.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.concursoexpress.dominio.entidades.Inscripcion;
import com.uisrael.concursoexpress.dominio.repositorio.IInscripcionRepositorio;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.InscripcionEntity;
import com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores.IInscripcionJpaMapper;
import com.uisrael.concursoexpress.infraestructura.repositorio.IInscripcionJpaRepositorio;


public class InscripcionRepositorioImpl implements IInscripcionRepositorio{
	
	private final IInscripcionJpaRepositorio jpaRepositorio;
	private final IInscripcionJpaMapper entityMapper;
	
	

	public InscripcionRepositorioImpl(IInscripcionJpaRepositorio jpaRepositorio, IInscripcionJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Inscripcion guardar(Inscripcion nuevaInscripcion) {
		InscripcionEntity entidad = entityMapper.toEntity(nuevaInscripcion);
		InscripcionEntity guardado = jpaRepositorio.save(entidad);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Inscripcion> buscarPorId(int idInscripcion) {
		
		return jpaRepositorio.findById(idInscripcion).map(entityMapper::toDomain);
	}

	@Override
	public List<Inscripcion> listarTodos() {
		
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idInscripcion) {
		jpaRepositorio.deleteById(idInscripcion);
	}

}
