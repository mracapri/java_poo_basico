package com.curso;

public class Persona{
	private String nombre;
	private String ap;
	private String am;

	public Persona(String nombre, String ap, String am){
		this.nombre = nombre;
		this.ap = ap;
		this.am = am;
	}

	public void comer(Object o){
		System.out.println("Comiendo: " + o);
	}
}
