package aula06;

import java.util.List;
import java.util.Scanner;

public class Clinica {
	
	Scanner input = new Scanner(System.in);
	
	private String cnpj, razSocial;
	private List<Mamifero> mamifero;
	
	public Clinica(String cnpj, String razSocial) {
		super();
		this.cnpj = cnpj;
		this.razSocial = razSocial;
	}

	public void cadastrar() {
		Mamifero mamifero = null;
		System.out.println("Escolha uma opção");
		System.out.println("1 - GATO");
		System.out.println("2 - CACHORRO");
		System.out.println("3 - CAVALO");
		
		int opc = input.nextInt();
		
		input.nextLine();
		
		switch(opc) {
			case 1:
				mamifero = new Gato("Felix", "Munskin");
				break;
				
			case 2:
				mamifero = new Cachorro("Yoda", "Spitz Alemão");
				break;
				
			case 3:
				mamifero = new Cavalo("Spice Jack", "Paint Horse");
				break;
				
			default:
				System.out.print("Opção invalida");
				break;
		}
		System.out.println("Animal inserido com sucesso!");
	}
	
	public void listarAnimais() {
		for(Mamifero mamifero : animais) {
			System.out.println(mamifero.getNome());
			System.out.println(mamifero.getRaca());
			if(mamifero instanceof Cachorro) {
				((Cachorro)mamifero).brincar();
			}
		}
	}
}
