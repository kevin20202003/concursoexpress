package com.uisrael.concursoexpress.presentacion.dto.response;

import java.util.Date;

import lombok.Data;

@Data
public class InscripcionResponseDto {
	
	private int idInscripcion;
	private Date fechaInscripcion;
	private String observacion;
	private boolean estadoRegistro;

}
