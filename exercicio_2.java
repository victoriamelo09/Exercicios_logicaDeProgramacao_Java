package exercicios_gen;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("\nEntre com o A: ");
		a = ler.nextInt();
		System.out.println("\nEntre com o B: ");
		b = ler.nextInt();
		System.out.println("\nEntre com o C: ");
		c = ler.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("\nOrden crescente: "+a+" , "+b+" , e "+c);
		}else if(a<=c && c<=b) {
			System.out.println("\nOrden crescente: "+a+" , "+c+" , e "+b);
		}else if(b<=a && a<=c) {
			System.out.println("\nOrden crescente: "+b+" , "+a+" , e "+c);
		}else if(b<=c && c<=a) {
			System.out.println("\nOrden crescente: "+b+" , "+c+" , e "+a);
		}else if(c<=a && a<=b) {
			System.out.println("\nOrden crescente: "+c+" , "+a+" , e "+b);
		}else {
			System.out.println("\nOrden crescente: "+c+" , "+b+" , e "+a);
		}

	}

}
