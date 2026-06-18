package com.uisrael.concursoexpress.dominio.entidades;

import java.util.Date;

public class Inscripcion {
	
	private int idInscripcion;
	private Date fechaInscripcion;
	private String observacion;
	private boolean estadoRegistro;
	
	
	public Inscripcion() {
		super();
	}
	public Inscripcion(int idInscripcion, Date fechaInscripcion, String observacion, boolean estadoRegistro) {
		super();
		this.idInscripcion = idInscripcion;
		this.fechaInscripcion = fechaInscripcion;
		this.observacion = observacion;
		this.estadoRegistro = estadoRegistro;
	}
	public int getIdInscripcion() {
		return idInscripcion;
	}
	public void setIdInscripcion(int idInscripcion) {
		this.idInscripcion = idInscripcion;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public boolean isEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(boolean estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	
	

}
