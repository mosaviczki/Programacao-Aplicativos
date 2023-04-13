package aula06;

import java.util.Scanner;

public class QuadrilateroTeste {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String cor;
		Quadrilatero quad1 = null;
		
		System.out.println("Escolha uma opção");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retangulo");
		System.out.println("3 - Losango");
		
		
		
		int opc = input.nextInt();

		
		
		switch(opc) {
			case 1:
				System.out.println("Cor: ");
				cor = input.next();
				System.out.println("Lado: ");
				double lado = input.nextDouble();
				quad1 = new Quadrado(cor, lado);
				break;
				
			case 2:
				System.out.println("Cor: ");
				cor = input.next();
				System.out.println("Base: ");
				double base = input.nextDouble();
				System.out.println("Altura: ");
				double altura = input.nextDouble();
				quad1 = new Retangulo(cor, base, altura);
				break;
				
			case 3:
				System.out.println("Cor: ");
				cor = input.next();
				System.out.println("Diagonal menor: ");
				double diagMenor = input.nextDouble();
				System.out.println("Diagonal maior: ");
				double diagMaior = input.nextDouble();
				quad1 = new Losango(cor, diagMenor, diagMaior);
				break;
				
			default:
				System.out.println("Opção inválida!");
		}
		
		quad1.calcularArea();
		System.out.println(quad1.getCor());
		quad1.calcularPerimetro();
	}
}
