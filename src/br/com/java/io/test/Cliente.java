package br.com.java.io.test;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6084367685489490829L;
	private String nombre;
	private long documento;
	private int edad;
	
	public Cliente(String nombre, long documento, int edad) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public long getDocumento() {
		return documento;
	}
	
}
