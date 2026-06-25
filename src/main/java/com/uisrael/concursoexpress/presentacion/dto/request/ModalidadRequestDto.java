package com.uisrael.concursoexpress.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ModalidadRequestDto {
	
	@NotBlank
	private int idModalidad;
	@NotBlank
	private String nombreModalidad;
	@NotBlank
	private String descripcion;
	@NotBlank
	private boolean estadoRegistro;

}
