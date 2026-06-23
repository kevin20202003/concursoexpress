package com.uisrael.concursoexpress.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.concursoexpress.aplicacion.casosuso.entrada.ICategoriaUseCase;
import com.uisrael.concursoexpress.dominio.entidades.Categoria;
import com.uisrael.concursoexpress.dominio.repositorio.ICategoriaRepositorio;

public class CategoriaUseCaseImpl implements ICategoriaUseCase{
	
	private final ICategoriaRepositorio repositorio;
	

	public CategoriaUseCaseImpl(ICategoriaRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	@Override
	public Categoria guardar(Categoria nuevaCategoria) {

		return repositorio.guardar(nuevaCategoria);
	}

	@Override
	public Categoria buscarPorId(int idCategoria) {

		return repositorio.buscarPorId(idCategoria).orElseThrow(()-> new RuntimeException("Categoria no encontrada"));
	}

	@Override
	public List<Categoria> listarTodos() {

		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idCategoria) {

		repositorio.eliminar(idCategoria);
		
	}

}
