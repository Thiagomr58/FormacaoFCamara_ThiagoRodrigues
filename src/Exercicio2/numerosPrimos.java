package Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class numerosPrimos {
	
	private static ArrayList<Integer> arrayList;
		
	 public static void main (String args[]) {
		
		arrayList = new ArrayList<>();
		int n_inicial, n_final, i, j;
		boolean isPrimo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número inicial:");
		n_inicial = scan.nextInt();
		
		if(n_inicial == 0) {
			System.err.println("O Número tem que ser maior que zero!");
			System.out.println("Digite o número inicial:");
			n_inicial = scan.nextInt();
			
		}
		
		System.out.println("Digite o número final: ");
		n_final = scan.nextInt();	
		
		
		if(n_final <= n_inicial) {
			System.err.println("O número final tem que ser maior que o número inicial!");
			System.out.println("Digite o número final: ");
			n_final = scan.nextInt();
		}
		
		for(i = n_inicial; i<= n_final; i++) {
			isPrimo = true; // considero que todos sejam primos, afim de realizar as eliminações dos numeros não primos e encontrar os primos no intervalo
			
			// O número 1 não é um numero primo
			if( i == 1) {
				isPrimo = false;
			}
			
			if(isPrimo) {
				if((i%2 == 0) && (i != 2)) { // todo numero dividido por 2 com resto 0 que não seja o 2, nao é um numero primo
					isPrimo = false;
				}
			}
			
			if(isPrimo) {
				for(j = 2; j <= (i/2); j++) {
					if(i%j == 0) {
						isPrimo = false;
						break;
					}
				}
			}
			
			if(isPrimo) {
				arrayList.add(i);
			}
				
	   }
	
		System.out.println("Entrada: " +n_inicial+ " " +n_final  );
	System.out.println("Saída: " + arrayList.toString().replace(","," ").replace("["," ").replace("]"," "));
	}
}
