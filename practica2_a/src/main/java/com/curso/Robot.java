package com.curso;

public class Robot{
	private SistemaOperativo sistemaOperativo;
	private String nombre;

	public Robot(){
		sistemaOperativo = new SistemaOperativo();
	}

	public void despertar(){
		System.out.println("Despertando robot!");
	}

	public void dormir(){
		System.out.println("Durmiendo robot!");
	}
	
	public void ejecutandoComando(String comando){
		// logica para ejecutar comandos
	}
}
