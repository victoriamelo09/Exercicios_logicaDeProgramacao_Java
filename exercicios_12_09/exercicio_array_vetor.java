package exercicios_gen;

import java.util.Scanner;

public class exercicio_array_vetor {

	public static void main(String[] args) {
		// A
		float A[] = {1,0,5,-2,-5,7};
		// B
		float simples = A[0] + A[1] + A[5]; 
		
		System.out.printf("\nResultado: " + simples);
		
		// C 
		
		A[4] = 100; 
		System.out.printf("\nResultado: " + A[4]);
		
		System.out.printf("\nLetra D: ");
		System.out.printf("\nPosição 1: " + A[0]);
		System.out.printf("\nPosição 2: "+ A[1]);
		System.out.printf("\nPosição 3: "+ A[2]);
		System.out.printf("\nPosição 4: "+ A[3]);
		System.out.printf("\nPosição 5: "+ A[4]);
		System.out.printf("\nPosição 6: "+ A[5]);
		

	}

}
