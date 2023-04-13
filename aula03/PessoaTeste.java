package aula03;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Maria da Silva", "10/03/1990", "Feminino", "maria@email.com", "Av. Monteiro Lobato", 222, "Jardim Carvalho", "Ponta Grossa", "PR", EstadoCivil.CASADO);
		System.out.println(pessoa1);
	}
}
