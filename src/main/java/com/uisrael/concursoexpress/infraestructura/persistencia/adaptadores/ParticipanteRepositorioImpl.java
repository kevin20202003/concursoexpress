package com.uisrael.concursoexpress.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.concursoexpress.dominio.entidades.Participante;
import com.uisrael.concursoexpress.dominio.repositorio.IParticipanteRepositorio;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.ParticipanteEntity;
import com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores.IParticipanteJpaMapper;
import com.uisrael.concursoexpress.infraestructura.repositorio.IParticipanteJpaRepositorio;

public class ParticipanteRepositorioImpl implements IParticipanteRepositorio{
	
	private final IParticipanteJpaRepositorio jpaRepositorio;
	private final IParticipanteJpaMapper entityMapper;

	public ParticipanteRepositorioImpl(IParticipanteJpaRepositorio jpaRepositorio,
			IParticipanteJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Participante guardar(Participante nuevaParticipante) {
		ParticipanteEntity entidad = entityMapper.toEntity(nuevaParticipante);
		ParticipanteEntity guardado = jpaRepositorio.save(entidad);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Participante> buscarPorId(int idParticipante) {

		return jpaRepositorio.findById(idParticipante).map(entityMapper::toDomain);
	}

	@Override
	public List<Participante> listarTodos() {

		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idParticipante) {
		jpaRepositorio.deleteById(idParticipante);
		
	}

}
