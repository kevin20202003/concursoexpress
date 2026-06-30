package com.uisrael.concursoexpress.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class InscripcionParticipanteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInscripcionParticipante;
	@ManyToOne
	@JoinColumn(name = "fkParticipanteEntity")
	private ParticipanteEntity idParticipanteEntity;
	@ManyToOne
	@JoinColumn(name = "fkInscripcionEntity")
	private InscripcionEntity fkInscripcionEntity;
	private String observacion;
	private boolean estadoRegistro;

}
