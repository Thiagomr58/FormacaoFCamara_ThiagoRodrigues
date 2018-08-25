package exercicio6;

import java.util.Scanner;

public class main {
	
	public static void main(String args[]) {
		int key; 
		double novaBase, novaAltura, base, altura;;
		
		modelaRetangulo obj = new modelaRetangulo();
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite a base: ");
		base = scan.nextDouble();
		
		System.out.println("Digite a Altura: ");
		altura = scan.nextDouble();
		
		System.out.println("Escolha uma opção.");
		System.out.println("1 - Mudar Valor dos Lados \n 2 - calcular área \n 3 - calcular perimetro");
		key = scan.nextInt();
		switch (key) {
		case 1:
			System.out.println("Digite a base: ");
			novaBase = scan.nextDouble();
			
			System.out.println("Digite a Altura: ");
			novaAltura = scan.nextDouble();
			
			obj.mudarValor(novaBase, novaAltura);
			
			System.out.println("Valor antigo da base: " + base + " \nValor antigo da altura: " +altura);
			
			System.out.println("Novo valor da base: " + obj.base + " \n novo valor da altura: " + obj.altura );
			
			break;
		case 2:
			double resultA = obj.calc_area(base, altura);
			System.out.println("Área: " +resultA);
					
			break;
		case 3:
			double resultB = obj.calc_perimetro(base, altura);
			System.out.println("Perimetro: " +resultB);
	        break;
		}
		
	}

}
