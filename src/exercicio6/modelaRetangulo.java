package exercicio6;

public class modelaRetangulo {
	
	double base, altura;
	
	public double calc_area(double base, double altura) {
		double area;
		
		area = base * altura;
		
		return area;
		
	}
	
	public double calc_perimetro(double base, double altura) {
		double perimetro = 0;
		
		perimetro = 2 * (base * altura);
		return perimetro;
	}
	
	public void mudarValor(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

}
