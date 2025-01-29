package ej1_T6;

import java.util.Random;
import java.util.Scanner;

public class Enteros10 {//Comentario de la práctica de git.*Edición* Comentario añadido.
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] enteros = new int [10];
	
		enteros [0] = r.nextInt(50);
	
		enteros [1] = r.nextInt(50);
		
		enteros [2] = r.nextInt(50);

		enteros [3] = r.nextInt(50);

		enteros [4] = r.nextInt(50);

		enteros [5] = r.nextInt(50);

		enteros [6] = r.nextInt(50);
	
		enteros [7] = r.nextInt(50);

		enteros [8] = r.nextInt(50);

		enteros [9] = r.nextInt(50);
		int sumaTotal = 0;
		
		for (int numero : enteros) {//Este bucle recorre el array entero, sin necesidad de .length() o i++, la variable es el valor de lo que se encuentra en dicha posición.
			sumaTotal += numero;	//Estos bucles solo permiten la lectura del array, para modificar su interior usaremos for(int i = 0; i < enteros.length(); i++){}.
			System.out.println("Cuadrado: "+Math.pow(numero, 2)+". Cubo: "+Math.pow(numero, 3));
		}
		System.out.println("La suma total del array 'enteros' es: "+sumaTotal+".");
	}
	
}
