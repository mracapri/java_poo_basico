package com.curso;

public class Robot{

	////////////////////////////////////////
	// Caracteristicas que tiene un robot //
	////////////////////////////////////////
	public SistemaOperativo sistemaOperativo;
	public String nombre;


	public Robot(){
		this.sistemaOperativo = new SistemaOperativo();
	}

	//////////////////////////////////
	// Funciones que tiene un robot //
	//////////////////////////////////
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
