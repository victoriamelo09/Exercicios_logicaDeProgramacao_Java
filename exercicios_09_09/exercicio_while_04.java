package exercicios_gen;

import java.util.Scanner;

public class exercicio_while_04 {

	public static void main(String[] args) {
		
		
		int idade,genero,fp,contPc=0,contMn=0,contHa=0,contNdc=0,contPn40=0,contPc18=0,pessoas=1;
		
		Scanner leia = new Scanner(System.in); 
		
		while(pessoas<=6) {
			
			System.out.println("\nEntre com a sua idade :"); 
			idade = leia.nextInt(); 
			System.out.println("\nEntre com seu genero :\n(1)Feminino\n(2)Masculino\n(3)Não Decalrado"); 
			genero = leia.nextInt();
			System.out.println("\nEntre com seu fator psicológico :\n(1)Calma\n(2)Nervosa\n(3)Agressivos"); 
			fp = leia.nextInt();
			
			if(fp == 1) {
				contPc++;
			}
			
			if(genero == 1 && fp == 2) {
				contMn++;
			}
			
			if(genero == 2 && fp ==3) {
				contHa++;
							
			}
			
			if(genero == 3 && fp == 1) {
				contNdc++; 
			}
			
			if(fp == 2 && idade >40) {
				contPn40++;
				
			}
			
			if(fp == 1 && idade < 18) {
				contPc18++;
				
			}
			
			pessoas ++;
		}
		System.out.println("\nNúmero de pessoas calmas: "+contPc);
		System.out.println("\nNúmero de mulheres nervosas: "+contMn);
		System.out.println("\nNúmero de homens agressivos: "+contHa);
		System.out.println("\nNúmero de pessoas não declaradas calmas: "+contNdc);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+contPn40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+contPc18);
		
		
		
		

	}

}
