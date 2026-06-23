package com.uisrael.concursoexpress.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.InscripcionEntity;

public interface IInscripcionJpaRepositorio extends JpaRepository<InscripcionEntity, Integer>{

}
