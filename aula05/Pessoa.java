package aula05;

import aula03.Endereco;

public class Pessoa {
	protected Endereco end;
	protected String nome;
	protected int idade;

	public Pessoa(String nome, int idade, String logradouro, int numero, String bairro, String cidade,
			String unidadeFederativa) {
		this.end = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
		this.nome = nome;
		this.idade = idade;
	}
}
