package com.uisrael.concursoexpress.presentacion.dto.response;

import lombok.Data;

@Data
public class ParticipanteResponseDto {
	
	private int idParticipante;
	private String nombre;
	private String apellido;
	private String identificacion;
	private String correoPersonal;
	private String telefono;
	private String direccion; 
	private boolean estadoRegistro;

}
