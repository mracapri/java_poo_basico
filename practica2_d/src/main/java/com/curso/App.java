package com.curso;

public class App{

	public static void main(String[] arg){
		
		Tamal tamal = new Tamal(1);
		Pan pan = new Pan();		

		TortaDeTamal torta = new TortaDeTamal(tamal, pan);

		Persona alex = new Persona("Alex","De la Fuente", "Catalan");
		alex.comer(torta); 
	}
}
