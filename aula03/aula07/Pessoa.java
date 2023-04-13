package aula07;

public class Pessoa {
	private String nome, logradouro, bairro, cidade, estado;
	private int idade, cpf, numCasa, cep;
	
	public Pessoa(String nome, String logradouro, String bairro, String cidade, String estado, int idade, int cpf,
			int numCasa, int cep) {
		this.nome = nome;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.idade = idade;
		this.cpf = cpf;
		this.numCasa = numCasa;
		this.cep = cep;
	}

	@Override
	public String toString(){
		return "Nome: " + this.nome + "\n" +
				"Idade: " + this.idade + "\n" +
				"CPF: " + this.cpf+ "\n" +
				"Endereço: " + this.logradouro + ", " + this.numCasa + " - " + this.bairro + ", " + this.cep + " " + this.cidade + " - " + this.estado +"\n"; 
	}
	
	
	
}
