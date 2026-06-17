package com.uisrael.concursoexpress.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "categoria")
public class CategoriaEntity {

		@Id
		private int idCategoria;
		private String nombreCategoria;
		private String descripcion;
		private boolean estadoRegistro;
		
	
}
