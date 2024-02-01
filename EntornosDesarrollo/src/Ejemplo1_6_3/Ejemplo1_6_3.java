package Ejemplo1_6_3;

import java.util.Scanner;

public class Ejemplo1_6_3 {

	public static void main(String[] args) {
		
		
		int suma = 0;
		
		int num = 1;
		
		System.out.println("Introduzca un numero mayor o igual que 1: ");
		
		Scanner tecladoScanner = new Scanner(System.in);
		
		int maximo = tecladoScanner.nextInt();
		
		while (num <= maximo) {
			
			if (num % 2 == 0) 
				
				suma = suma + maximo;
			
			
			++ num;
			
			
			} 
		
		System.out.println("La suma entre los numeros pares entre 1 y " + maximo + " es " + suma);
 			
			
		}
}
