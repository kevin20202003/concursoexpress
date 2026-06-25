package com.uisrael.concursoexpress.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoriaRequestDto {
	
	@NotBlank
	private int idCategoria;
	@NotBlank
	private String nombreCategoria;
	@NotBlank
	private String descripcion;
	@NotBlank
	private boolean estadoRegistro;

}
