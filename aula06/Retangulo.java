package aula06;

public class Retangulo extends Quadrilatero{
	
	private double base, altura, area, perimetro;

	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		this.area = this.base*this.altura;
		System.out.println("Area: " + this.area);
	}
	
	@Override
	public void calcularPerimetro() {
		this.perimetro = (this.base*2) + (this.altura*2);
		System.out.println("Perimetro: " + this.perimetro);
	}
}
