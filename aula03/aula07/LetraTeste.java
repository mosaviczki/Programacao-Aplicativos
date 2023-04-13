package aula07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LetraTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letra1, letra2;
		try {
			System.out.println("String 1:");
			letra1 = input.nextLine();
			System.out.println("String 2:");
			letra2 = input.nextLine();
			Letras l1 = new Letras(letra1, letra2);
			System.out.println(l1.comparar());
			System.out.println(l1.contarString(letra1));
			System.out.println(l1.converterMaiuscula(letra1));
			System.out.println(l1.converterMinuscula(letra2));
			
		}catch(InputMismatchException io) {
			System.out.println("Entrada de dados invalida!");
		}catch(Exception e) {
			System.out.println("Ocorreu uma exceção");
		}finally {
			input.close();
			System.out.println("Finalizando bloco.");
		}
	}
}
