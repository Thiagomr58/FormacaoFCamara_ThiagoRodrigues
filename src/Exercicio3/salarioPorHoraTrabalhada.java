package Exercicio3;

import java.util.Scanner;

public class salarioPorHoraTrabalhada {
	
	public static void main(String args[]) {
		
		float horaTrabalhada;
		double salarioMinimo, salarioAReceber, salarioBruto, valorHoraTrabalhada;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a qtd de horas trabalhadas");
		horaTrabalhada = scan.nextFloat();
		
		System.out.println("Digite o salário minimo R$: ");
		salarioMinimo = scan.nextDouble();
		
		valorHoraTrabalhada = (salarioMinimo * 10 ) / 100;
		System.out.println("Valor da Hora Trabalhada: " + "R$ " +valorHoraTrabalhada);
		
		salarioBruto = horaTrabalhada * valorHoraTrabalhada;
		System.out.println("Salario Bruto: " + "R$ " +salarioBruto);
		
		salarioAReceber = salarioBruto - ((salarioBruto * 0.3) / 10);
		System.out.println("Salario a Receber: " + "R$ " +salarioAReceber);
		
		System.out.println("Valor do desconto: " + "R$ " + (salarioBruto - salarioAReceber));
	}
	

}
