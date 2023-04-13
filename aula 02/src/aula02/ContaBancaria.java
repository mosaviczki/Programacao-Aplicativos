package aula02;

public class ContaBancaria {

	private int numero;
	private double saldo;
	private String titular;

	public ContaBancaria(int numero, String titular) {
		this.numero = numero;
		this.saldo = 0.00;
		this.titular = titular;
	}

	public void sacar(double valor) {
		if (this.saldo > 0 && this.saldo >= valor) {
			System.out.println("Saque no valor de R$" + valor + " realizado com sucesso!");
			this.saldo -= valor;
		} else {
			System.out.println("Você não possui quantia suficiente para saque!");
		}

	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Valor de R$" + valor + " depositado com sucesso!");
		this.calcularRendimento();
	}

	public void imprimirSaldo() {
		System.out.println("======================");
		System.out.println("Saldo atual: R$" + this.saldo);
		System.out.println("======================");
	}

	private void calcularRendimento() {
		this.saldo += (this.saldo * 0.05);
	}

	@Override
	public String toString() {
		return "===== Conta Bancaria ===== \n" + "Titular: " + this.titular + "\n" + "Numero: " + this.numero + "\n"
				+ "Saldo: " + this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
