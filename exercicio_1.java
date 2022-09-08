package exercicios_gen;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		
		int x; // 10-14 infantil   15-17 juvenil  18-25 adulto //
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade para descobrir sua categoria :");
		x = leia.nextInt();
		
		if(x>=10 && x<=14) {
			System.out.println("\nVocê faz parte da categoria infantil ");
			
		}else if(x>=15 && x<=17) {
			System.out.println("\nVocê faz parte da categoria juvenil ");
			
		}else if (x>=18 && x<=25) {
			System.out.println("\nVocê faz parte da categoria adulto ");
			
		}else {
			System.out.println("\nOpção invalida");
			
			
			
		}
		
		


	}

}
