package aula07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome, logradouro, bairro, cidade, estado;
		int idade, cpf, numCasa, cep;
		try {
			
			System.out.println("Nome: ");
			nome = input.nextLine();
			System.out.println("Idade: ");
			idade = input.nextInt();
			System.out.println("CPF: ");
			cpf = input.nextInt();
			input.nextLine();
			System.out.println("Logradouro: ");
			logradouro = input.nextLine();
			System.out.println("Numero da casa: ");
			numCasa = input.nextInt();
			input.nextLine();
			System.out.println("Bairro: ");
			bairro = input.nextLine();
			System.out.println("CEP: ");
			cep = input.nextInt();
			input.nextLine();
			System.out.println("Cidade: ");
			cidade = input.nextLine();
			System.out.println("Estado: ");
			estado = input.nextLine();
			Pessoa pes = new Pessoa(nome, logradouro, bairro, cidade, estado, idade, cpf, numCasa, cep);
			System.out.println(pes);
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
