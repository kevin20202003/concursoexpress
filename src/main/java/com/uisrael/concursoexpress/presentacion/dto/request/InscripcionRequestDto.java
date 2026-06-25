package com.uisrael.concursoexpress.presentacion.dto.request;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class InscripcionRequestDto {
	
	@NotBlank
	private int idInscripcion;
	@NotBlank
	private Date fechaInscripcion;
	@NotBlank
	private String observacion;
	@NotBlank
	private boolean estadoRegistro;

}
