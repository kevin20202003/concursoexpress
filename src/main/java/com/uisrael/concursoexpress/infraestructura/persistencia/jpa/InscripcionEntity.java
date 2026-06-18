package com.uisrael.concursoexpress.infraestructura.persistencia.jpa;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "inscripcion")
public class InscripcionEntity {
	
	@Id
	private int idInscripcion;
	private Date fechaInscripcion;
	private String observacion;
	private boolean estadoRegistro;
	

}
