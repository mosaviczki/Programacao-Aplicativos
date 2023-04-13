package aula06;

public class Quadrado extends Quadrilatero{

	private double lado, area, perimetro;
	
	public Quadrado(String cor, double lado) {
		super(cor);
		this.lado = lado;
	}
	
	@Override
	public void calcularArea() {
		this.area = this.lado*this.lado;
		System.out.println("Area: " + this.area);
	}
	
	@Override
	public void calcularPerimetro() {
		this.perimetro = this.lado*4;
		System.out.println("Perimetro: " + this.perimetro);
	}
}
