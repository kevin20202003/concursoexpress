package com.uisrael.concursoexpress.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ParticipanteRequestDto {
	
	@NotBlank
	private int idParticipante;
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellido;
	@NotBlank
	private String identificacion;
	@NotBlank
	private String correoPersonal;
	@NotBlank
	private String telefono;
	@NotBlank
	private String direccion; 
	@NotBlank
	private boolean estadoRegistro;

}
