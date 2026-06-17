package com.uisrael.concursoexpress.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "modalidad")
public class ModalidadEntity {
	
	@Id
	private int idModalidad;
	private String nombreModalidad;
	private String descripcion;
	private boolean estadoRegistro;

}
