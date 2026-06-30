package com.uisrael.concursoexpress.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.CategoriaEntity;
import java.util.List;


public interface ICategoriaJpaRepositorio extends JpaRepository<CategoriaEntity, Integer>{
	
	List<CategoriaEntity> findByNombreCategoria(String nombreCategoria);
	List<CategoriaEntity> findByEstadoRegistro(boolean estadoRegistro);

}
