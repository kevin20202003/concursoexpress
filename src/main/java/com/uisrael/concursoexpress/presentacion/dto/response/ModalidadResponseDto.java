package com.uisrael.concursoexpress.presentacion.dto.response;

import lombok.Data;

@Data
public class ModalidadResponseDto {
	
	private int idModalidad;
	private String nombreModalidad;
	private String descripcion;
	private boolean estadoRegistro;

}
