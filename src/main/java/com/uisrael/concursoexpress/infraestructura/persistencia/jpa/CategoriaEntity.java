package com.uisrael.concursoexpress.infraestructura.persistencia.jpa;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "categoria")
public class CategoriaEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idCategoria;
		@Column(length = 80)
		private String nombreCategoria;
		@Column(name = ("descripcion_categoria"), length = 200)
		private String descripcion;
		private boolean estadoRegistro;
		@OneToMany(mappedBy = "fkCategoriaEntity")
		private List<InscripcionEntity> inscripciones;
		
	
}
