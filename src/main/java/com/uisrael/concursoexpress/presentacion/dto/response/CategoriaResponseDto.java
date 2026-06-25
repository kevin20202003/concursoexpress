package com.uisrael.concursoexpress.presentacion.dto.response;

import lombok.Data;

@Data
public class CategoriaResponseDto {
	
	private int idCategoria;
	private String nombreCategoria;
	private String descripcion;
	private boolean estadoRegistro;

}
