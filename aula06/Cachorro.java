package aula06;

public class Cachorro extends Mamifero{

	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}
	
	public void emitirSom() {
		System.out.println("AuAuAuAu!");
	}
	
	public void brincar() {
		System.out.println(this.nome + " está brincando!");
	}
	
	
}
