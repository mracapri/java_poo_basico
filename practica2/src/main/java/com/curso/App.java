package com.curso;

public class App{
	void hagoAlgo(){
		System.out.println("Hola mundo!");		
	}

	public static void main(String[] arg){
		App app = new App();
		app.hagoAlgo();

		Calculadora a;
		a = new Calculadora();

		double resultado = a.sumar(1,5);
		System.out.println("El resultado de la suma es: " + resultado);
	}
}
