package aula05;

public class Professor extends Pessoa {

	private double salario;

	public Professor(String nome, int idade, String logradouro, int numero, String bairro, String cidade,
			String unidadeFederativa) {
		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
		this.salario = 0.00;
	}

	public void calcularSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "--------------- Professor --------------- \n" + "Nome: " + this.nome + "\n" + "Idade: " + this.idade
				+ "\n" + "Salario: R$" + this.salario + "\n" + "Endereço: " + this.end.getLogradouro() + " "
				+ this.end.getNumero() + ", " + this.end.getBairro() + ", " + this.end.getCidade() + " - "
				+ this.end.getUnidadeFederativa() + "\n";
	}
}
