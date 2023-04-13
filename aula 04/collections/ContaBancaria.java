package aula04.collections;

public class ContaBancaria {
	private int numeroConta;
	private double saldo;
	private Cliente titularConta;
	
	public ContaBancaria(int numeroConta, Cliente titularConta) {
		this.numeroConta = numeroConta;
		this.saldo = 0;
		this.titularConta = titularConta;
	}

	public void realizarSaque(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
			
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void efetuarDeposito(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
		
	}
	public void emitirSaldo() {
		System.out.println("----------------------------------");
		System.out.println("Numero da conta: " + this.numeroConta);
		System.out.println("Titular: " + this.titularConta.getNome());
		System.out.println("CPF do titular: " + this.titularConta.getCpf());
		System.out.println("Saldo: R$" + this.saldo);
	}

	public int getNumeroConta() {
		return numeroConta;
	}
}
