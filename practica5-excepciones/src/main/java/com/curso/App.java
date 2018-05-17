package com.curso;

public class App{

	public static void main(String[] arg){

        int a = 1;
        int b = 0;
        try {
            System.out.println(a/b);
        }catch(java.lang.ArithmeticException e){
            System.out.println("No se puede dividir entre CERO");
        }
    }
}