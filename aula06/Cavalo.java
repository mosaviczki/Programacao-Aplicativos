package aula06;

public class Cavalo extends Mamifero{

	public Cavalo(String nome, String raca) {
		super(nome, raca);
	}
	
	public void emitirSom() {
		System.out.println(nome + " " + raca +" relinzando!");
	}
}
