package com.uisrael.concursoexpress.dominio.entidades;

public class Modalidad {
	
	private int idModalidad;
	private String nombreModalidad;
	private String descripcion;
	private boolean estadoRegistro;
	
	
	public Modalidad() {
		super();
	}
	public Modalidad(int idModalidad, String nombreModalidad, String descripcion, boolean estadoRegistro) {
		super();
		this.idModalidad = idModalidad;
		this.nombreModalidad = nombreModalidad;
		this.descripcion = descripcion;
		this.estadoRegistro = estadoRegistro;
	}
	public int getIdModalidad() {
		return idModalidad;
	}
	public void setIdModalidad(int idModalidad) {
		this.idModalidad = idModalidad;
	}
	public String getNombreModalidad() {
		return nombreModalidad;
	}
	public void setNombreModalidad(String nombreModalidad) {
		this.nombreModalidad = nombreModalidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(boolean estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	
	
}
