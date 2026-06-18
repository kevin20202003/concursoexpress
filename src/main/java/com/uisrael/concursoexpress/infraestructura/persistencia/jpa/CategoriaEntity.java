package com.uisrael.concursoexpress.infraestructura.persistencia.jpa;

import jakarta.persistence.Column;
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
		@Column(length = 80)
		private String nombreCategoria;
		@Column(name = ("descripcion_categoria"), length = 200)
		private String descripcion;
		private boolean estadoRegistro;
		
	
}
