package aula02;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(23948, "João da Silva");
		
		//System.out.println(conta1);
		conta1.sacar(10);
		conta1.depositar(200);
		conta1.imprimirSaldo();
		conta1.sacar(75);
		conta1.imprimirSaldo();
	}

}
