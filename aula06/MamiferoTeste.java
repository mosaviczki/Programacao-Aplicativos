package aula06;

import java.util.Scanner;

public class MamiferoTeste {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Mamifero mam1= null;
		
		System.out.println("Escolha uma opção");
		System.out.println("1 - GATO");
		System.out.println("2 - CACHORRO");
		System.out.println("3 - CAVALO");
		
		int opc = input.nextInt();
		
		switch(opc) {
			case 1:
				mam1 = new Gato("Felix", "Munskin");
				break;
				
			case 2:
				mam1 = new Cachorro("Yoda", "Spitz Alemão");
				break;
				
			case 3:
				mam1 = new Cavalo("Spice Jack", "Paint Horse");
				break;
				
			default:
				System.out.print("Opção invalida");
				break;
		}
		
		mam1.emitirSom();
		
		
	}

}
