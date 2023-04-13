package aula04.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ExemploLista {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		int busca;
		
		Cliente cli1 = new Cliente(28473, "Maria da Silva");
		Cliente cli2 = new Cliente(22222, "João de Almeida");
		
		List <Cliente> listaCliente = new ArrayList<Cliente>();
		
		listaCliente.add(cli1);
		listaCliente.add(cli2);
		
		System.out.println ("Insira o cpf que deseja buscar: "); 
		busca = leitor.nextInt();
		
		for(Cliente cliente : listaCliente) {
			if (cliente.getCpf() == busca) {
				System.out.println("Nome: "+ cliente.getNome());
				System.out.println("CPF: " + cliente.getCpf());
				break;
			}else {
				System.out.println("Não foram encontrado pessoas com esse cpf!");
				break;
			}
		}
		
	}

}
