package aula05;

public class Aluno extends Pessoa {

	private String curso;

	public Aluno(String curso, String nome, int idade, String logradouro, int numero, String bairro, String cidade,
			String unidadeFederativa) {
		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
		this.curso = curso;
	}

	public void realizarMatricula() {
		System.out.println("Realizando matriculo do aluno " + this.nome);
	}

	@Override
	public String toString() {
		return "--------------- Aluno --------------- \n" + "Nome: " + this.nome + "\n" + "Idade: " + this.idade + "\n"
				+ "Curso: " + this.curso + "\n" + "Endereço: " + this.end.getLogradouro() + " " + this.end.getNumero()
				+ ", " + this.end.getBairro() + ", " + this.end.getCidade() + " - " + this.end.getUnidadeFederativa()
				+ "\n";
	}

}
