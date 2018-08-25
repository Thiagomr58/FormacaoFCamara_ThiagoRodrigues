package exercicio4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lojaDeTintas {
	
	public static void main(String args[]) {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		double area, valor=0, qtd_litros=0, qtd_galao=0;
		//int qtd_litros=0, qtd_galao=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a area em m²:");
		area = scan.nextFloat();
		
		qtd_litros = area / 3;
		qtd_galao  = qtd_litros / 18;
		valor = qtd_galao * 80;
		
		System.out.println("Você precisa comprar " + df.format(qtd_galao) +" latas de tintas!" );
		System.out.println("Que custará  um total de : R$" +df.format(valor));
		
		
	}
	
}
