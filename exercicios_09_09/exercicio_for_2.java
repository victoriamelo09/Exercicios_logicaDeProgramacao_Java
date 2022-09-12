package exercicios_gen;

import java.util.Scanner;

public class exercicio_for_2 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		
		int x, num, contImpar=0, contPar=0;
		
		Scanner leia = new Scanner(System.in); 
		
				
		for(x=0; x<=10; x++) {
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			
			if(num % 2 ==0) {
				contPar++;
			}else {
				contImpar++;
				
			}
		}
		System.out.println("\nQuantidade de números pares :"+ contPar);
		System.out.println("\nQuantidade de números ímpares :"+ contImpar);
		
		
	}

}
