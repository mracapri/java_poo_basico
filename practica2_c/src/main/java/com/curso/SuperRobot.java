package com.curso;

public class SuperRobot extends Robot{

	public SuperRobot(){
		/* 
		 * Usando el constructor de la clase padre
		 * que recibe como parametro el nombre
		 */
		super("Super Robot");
	}
	
	public SuperRobot(String nombre){
		/* constructor de la clase padre */
		super(nombre); 
	}

	public void recordar(){
	}

	public void acelerar(){
	}
}
