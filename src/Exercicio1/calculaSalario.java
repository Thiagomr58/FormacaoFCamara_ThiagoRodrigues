package Exercicio1;

import java.util.Scanner;

public class calculaSalario {

	public static void main (String args[]) {
		int anoDeContratacao, anoAtual;
		double percentual = 1.5, salarioInicial, salarioAtual = 0;
		String nomeEmpregado;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do Empregado: ");
		nomeEmpregado = scan.nextLine();
		
		System.out.println("Digite o ano de Contratação do Empregado: ");
		anoDeContratacao = scan.nextInt();
		
		System.out.println("Digite o ano Atual: ");
		anoAtual = scan.nextInt();
		
		System.out.println("Digite o Salário: ");
		salarioInicial = scan.nextDouble();
		
		
		for (int i = anoDeContratacao; i <= anoAtual; i++) {
			
			// O percentual só começa a contar a partir do segundo ano (2006)
			if(i !=anoDeContratacao) {
				
				// Calcula o salario multiplicado pelo percentual
				salarioAtual = salarioInicial + (salarioInicial * percentual/100);
				
				// o percentual dobra a cada ano
				percentual = percentual * 2;	
			}
		}
		
		System.out.println("\n");
		System.out.println(" O salario atual do funcionário " +nomeEmpregado+ " é igual a:" +salarioAtual);
		
		
	}
}
