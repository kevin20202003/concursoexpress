package com.uisrael.concursoexpress.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.concursoexpress.dominio.entidades.Categoria;
import com.uisrael.concursoexpress.dominio.repositorio.ICategoriaRepositorio;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.CategoriaEntity;
import com.uisrael.concursoexpress.infraestructura.persistencia.mapeadores.ICategoriaJpaMapper;
import com.uisrael.concursoexpress.infraestructura.repositorio.ICategoriaJpaRepositorio;

public class CategoriaRepositorioImpl implements ICategoriaRepositorio{

	private final ICategoriaJpaRepositorio jpaRepositorio;
	private final ICategoriaJpaMapper entityMapper;
	
	public CategoriaRepositorioImpl(ICategoriaJpaRepositorio jpaRepositorio, ICategoriaJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Categoria guardar(Categoria nuevaCategoria) {
		CategoriaEntity entidad = entityMapper.toEntity(nuevaCategoria);
		CategoriaEntity guardado = jpaRepositorio.save(entidad);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Categoria> buscarPorId(int idCategoria) {

		return jpaRepositorio.findById(idCategoria).map(entityMapper::toDomain);
	}

	@Override
	public List<Categoria> listarTodos() {
		
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idCategoria) {
		jpaRepositorio.deleteById(idCategoria);
		
	}

}
