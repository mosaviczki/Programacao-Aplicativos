package aula06;

public abstract class Mamifero {
	
	protected String nome, raca;
	
	public Mamifero(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	public void emitirSom() {
		System.out.println("Emitindo Som");
	}

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}
	
}
