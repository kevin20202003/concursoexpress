package com.uisrael.concursoexpress.dominio.entidades;


public class Categoria {
	
	private int idCategoria;
	private String nombreCategoria;
	private String descripcion;
	private boolean estadoRegistro;
	
	
	
	public Categoria() {
		super();
	}
	
	public Categoria(int idCategoria, String nombreCategoria, String descripcion, boolean estadoRegistro) {
		super();
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
		this.descripcion = descripcion;
		this.estadoRegistro = estadoRegistro;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
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
