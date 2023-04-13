package aula04.collections;

public class ContaTeste {
	public static void main(String[] args) {
		
		Banco banco1 = new Banco(16785, "NewBank");
		banco1.criarNovaConta(111, 12345, "Maria de Oliveira");
		banco1.criarNovaConta(222, 67890, "José de Lima");

		banco1.listarContas();
		banco1.realizarDeposito(111, 100);
		banco1.listarContas();
		
		//ContaBancaria contaBancaria1 = new ContaBancaria(111, new Cliente(12345, "Maria da Silva"));

		//ContaBancaria contaBancaria2 = new ContaBancaria(222, new Cliente(67890, "João de Almeida"));
		
		//contaBancaria1.emitirSaldo();
		//contaBancaria1.efetuarDeposito(100.00);
		//contaBancaria1.realizarSaque(35.50);
		//contaBancaria1.emitirSaldo();
	}

}
