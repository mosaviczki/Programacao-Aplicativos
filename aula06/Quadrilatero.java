package aula06;

public abstract class Quadrilatero {
	protected String cor;
	
	public Quadrilatero(String cor) {
		this.cor = cor;
	}

	public void calcularArea() {
		System.out.print("Calculando area...");
	}
	
	public void calcularPerimetro() {
		System.out.print("Calculando perimetro...");
	}

	public String getCor() {
		return cor;
	}
	
}
