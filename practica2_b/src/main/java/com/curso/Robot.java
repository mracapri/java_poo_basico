package com.curso;

public class Robot{
	private SistemaOperativo sistemaOperativo;
	private String nombre;

	public Robot(){
		// sistema operativo por defecto con nombre por defecto
		sistemaOperativo = new SistemaOperativo();
		nombre = "Robotek";
		System.out.println("Invocando Robot()");
		System.out.println(datosDelRobot());
	}
	
	public Robot(String nombre){
		/*
		 * invocando al constructor sin parametros, construyendo
		 * con el sistema operativo por defecto
		 * */
		this(); 
		
		/*
		 * Asignando el nombre al robot =D
		 * */
		this.nombre = nombre;
		
		System.out.println("Invocando Robot(String nombre)");
		System.out.println(datosDelRobot());
	}
	
	public Robot(SistemaOperativo sistemaOperativo){
		
		this("bobot");
		
		/*
		 * Este constructor siginifica que se puede
		 * cambiar por otro sistema operativo o el mismo
		 * siempre y cuando pertenezca a la misma clase
		 * */
		this.sistemaOperativo = sistemaOperativo;
		
		System.out.println("Invocando Robot(SistemaOperativo sistemaOperativo)");
		System.out.println(datosDelRobot());
	}
	
	public Robot(String nombre, SistemaOperativo sistemaOperativo){
		/* Construyendo un sistema operativo con nombre 
		 * y sistema opeartivo diferente o igual */
		this.nombre = nombre;
		this.sistemaOperativo = sistemaOperativo;
		
		System.out.println("Invocando Robot(String nombre, SistemaOperativo sistemaOperativo)");
		System.out.println(datosDelRobot());
	}
	
	public String datosDelRobot(){
		String datos = "nombre: " + this.nombre.toUpperCase();
		datos = datos + " sistema operativo: " + this.sistemaOperativo.getVersion();
		return  datos;
	}
}
