package com.uisrael.concursoexpress.dominio.entidades;


public class Participante {
	
	private int idParticipante;
	private String nombre;
	private String apellido;
	private String identificacion;
	private String correoPersonal;
	private String telefono;
	private String direccion; 
	private boolean estadoRegistro;
	
	
	
	public Participante(int idParticipante, String nombre, String apellido, String identificacion,
			String correoPersonal, String telefono, String direccion, boolean estadoRegistro) {
		super();
		this.idParticipante = idParticipante;
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.correoPersonal = correoPersonal;
		this.telefono = telefono;
		this.direccion = direccion;
		this.estadoRegistro = estadoRegistro;
	}
	
	
	
	public Participante() {
		super();
	}



	public int getIdParticipante() {
		return idParticipante;
	}
	public void setIdParticipante(int idParticipante) {
		this.idParticipante = idParticipante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getCorreoPersonal() {
		return correoPersonal;
	}
	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public boolean isEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(boolean estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	
	

}
