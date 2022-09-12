package exercicios_gen;

import java.util.Scanner;

public class exercicio_Array_Matriz {

	public static void main(String[] args) {
		// 3x3 e escreva quantos valores maiores que 10 ela possui 
		
		int[][] matriz = new int [3][3]; 
		int linha,coluna;
		Scanner ler = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				
				System.out.println("\nEntre com um número: ");
				matriz[linha][coluna] = ler.nextInt();
				
			}
		}
		System.out.println("\n--Matriz--");
		//FAZ UM LOOP PELAS COLUNAS DA LINHA ATUAL
        for( linha = 0; linha < 3; linha++)
        {
        	
            //FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
            for( coluna = 0; coluna < 3; coluna++)
                System.out.printf("%d ", matriz[linha][coluna]);
        }
		

	}


}
