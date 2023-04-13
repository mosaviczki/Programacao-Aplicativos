package aula05;

public class Carro extends Veiculo{

	private int numPortas;
	
	public Carro(int numPortas,String modelo, String fabricante, String combustivel, int ano, int numPassageiros) {
		super(modelo, fabricante, combustivel, ano, numPassageiros);
		this.numPortas= numPortas;
	}

	public void calibrarPneus() {
		System.out.println(this.fabricante + " " + this.modelo+ " está sendo calibrado!");
	}
	
	@Override
	public String toString() {
		return "Veiculo \n" + "Modelo: " + this.modelo + "\n" +
				"Fabricante: " + this.fabricante + "\n" +
				"Ano: " + this.ano + "\n" +
				"Numero de passageiros: " + this.numPassageiros + "\n" +
				"Numero de portas: " + this.numPortas + "\n" +
				"Tipo de combustivel: " + this.combustivel + "\n";
	}
	
}
