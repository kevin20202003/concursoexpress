package com.uisrael.concursoexpress.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.concursoexpress.infraestructura.persistencia.jpa.ModalidadEntity;

public interface IModalidadJpaRepositorio extends JpaRepository<ModalidadEntity, Integer>{

}
