package aula04.collections;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private int cnpj;
	private String razaoSocial;
	private List <ContaBancaria> contasBancarias;
	
	public Banco(int cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.contasBancarias = new ArrayList<ContaBancaria>();
	}
	
	public void criarNovaConta(int numeroConta, int cpfTitular, String nomeTitular) {
		ContaBancaria cb1 = new ContaBancaria(numeroConta, new Cliente(cpfTitular, nomeTitular));
		this.contasBancarias.add(cb1);
	}
	
	public void removerConta(int numeroConta) {
		for (ContaBancaria contaBancaria : contasBancarias) {
			if(contaBancaria.getNumeroConta() == numeroConta) {
				this.contasBancarias.remove(contaBancaria);
				break;
			}
		}
	}
	
	public void realizarDeposito(int numeroConta, double valor) {
		for (ContaBancaria contaBancaria : contasBancarias) {
			if(contaBancaria.getNumeroConta() == numeroConta) {
				contaBancaria.efetuarDeposito(valor);
			}
		}
	}
	
	public void listarContas() {
		for (ContaBancaria contaBancaria : contasBancarias) {
			contaBancaria.emitirSaldo();
		}
	}
	

}
