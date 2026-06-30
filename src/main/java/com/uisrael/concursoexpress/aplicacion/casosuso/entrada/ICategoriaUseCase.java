package com.uisrael.concursoexpress.aplicacion.casosuso.entrada;

import java.util.List;

import com.uisrael.concursoexpress.dominio.entidades.Categoria;
import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.CategoriaEntity;

public interface ICategoriaUseCase {

	Categoria guardar(Categoria nuevaCategoria);
	
	Categoria buscarPorId (int idCategoria);
	
	List<Categoria> listarTodos();
	
	void eliminar(int idCategoria);
	
	List<Categoria> findByNombreCategoria(String nombreCategoria);
}
