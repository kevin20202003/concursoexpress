package com.uisrael.concursoexpress.infraestructura.persistencia.jpa;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "participante")
public class ParticipanteEntity {
	@Id
	private int idParticipante;
	private String nombre;
	private String apellido;
	private String identificacion;
	private String correoPersonal;
	private String telefono;
	@Column(length = 80)
	private String direccion; 
	private boolean estadoRegistro;
	

}
