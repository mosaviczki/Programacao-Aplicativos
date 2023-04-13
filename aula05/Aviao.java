package aula05;

public class Aviao extends Veiculo{

	private int altMax;
	
	public Aviao(int altMax,String modelo, String fabricante, String combustivel, int ano, int numPassageiros) {
		super(modelo, fabricante, combustivel, ano, numPassageiros);
		this.altMax = altMax;
	}
	
	public void voar() {
		System.out.println(fabricante + " " + modelo + " está voando!");
	}
	
	@Override
	public String toString() {
		return "Aviao \n" + "Modelo: " + this.modelo + "\n" +
				"Fabricante: " + this.fabricante + "\n" +
				"Ano: " + this.ano + "\n" +
				"Numero de passageiros: " + this.numPassageiros + "\n" +
				"Altitude máxima: " + this.altMax + "\n" +
				"Tipo de combustivel: " + this.combustivel + "\n";
	}
	
}
