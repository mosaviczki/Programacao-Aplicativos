package aula05;

public class Veiculo {
	
	protected String modelo, fabricante, combustivel;
	protected int ano, numPassageiros, numPortas;
	
	public Veiculo(String modelo, String fabricante, String combustivel, int ano, int numPassageiros) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.combustivel = combustivel;
		this.ano = ano;
		this.numPassageiros = numPassageiros;
	}
	
	public void abastecer() {
		System.out.print(this.fabricante + " " + this.modelo + " está abastecendo!");
	}

}
