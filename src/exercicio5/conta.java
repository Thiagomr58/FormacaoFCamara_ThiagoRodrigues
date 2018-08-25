package exercicio5;

public class conta {

	/*Crie uma classe para implementar uma conta corrente. A classe deve
	possuir os seguintes atributos: número da conta, nome do correntista e
	saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No
	construtor, saldo é opcional, com valor default zero e os demais atributos
	são obrigatórios. */
	
	int numeroConta;
	String nomeCorretista;
	double saldo=0;
	
	public conta(int numeroConta, String nomeCorretista) {
		this.numeroConta = numeroConta;
		this.nomeCorretista = nomeCorretista;
		
	}
	
	public void deposito( double valor) {
		this.saldo = saldo + valor;
	}
	
	public void saque(double valorSaque) {
		this.saldo = saldo + valorSaque;
	}
	
	public void alterarNome(String novoNome) {
		this.nomeCorretista = novoNome;
	}
	
}
