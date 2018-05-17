package com.curso;

public class App{

	public static void main(String[] arg){
		
		// Iniciando robot en el main
		Robot robot = new Robot();
		robot.nombre = "Robotin";

		// invocando metodo despertar del robot
		robot.despertar();


		System.out.println(
			String.format("El nombre del robot es %s", robot.nombre));
	
	}
}
