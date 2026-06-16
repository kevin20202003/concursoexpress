package com.uisrael.concursoexpress.infraestructura.persistencia.jpa;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ParticipanteEntity {
	@Id
	private int idParticipante;
	private String nombre;
	private String apellido;
	private String identificacion;
	private String correoPersonal;
	private String telefono;
	private boolean estadoRegistro;
	

}
