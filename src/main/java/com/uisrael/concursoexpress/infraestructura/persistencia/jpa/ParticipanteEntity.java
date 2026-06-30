package com.uisrael.concursoexpress.infraestructura.persistencia.jpa;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "participante")
public class ParticipanteEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idParticipante;
	private String nombre;
	private String apellido;
	private String identificacion;
	private String correoPersonal;
	private String telefono;
	@Column(length = 80)
	private String direccion; 
	private boolean estadoRegistro;
	@OneToMany(mappedBy = "idParticipanteEntity")
	private List<InscripcionParticipanteEntity> listaParticipantes;
	

}
