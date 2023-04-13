package aula06;

public class Losango extends Quadrilatero{
	private double diagonalMenor, diagonalMaior, area, perimetro, lado;

	public Losango(String cor, double diagonalMenor, double diagonalMaior) {
		super(cor);
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	@Override
	public void calcularArea() {
		this.area = (this.diagonalMaior*this.diagonalMenor)/2;
		System.out.println("Area: " + this.area);
	}
	
	@Override
	public void calcularPerimetro() {
		this.lado = Math.sqrt(Math.pow(this.diagonalMaior/2, 2)+ Math.pow(this.diagonalMenor/2, 2));
		this.perimetro = this.lado*4;
		System.out.println("Perimetro: " + this.perimetro);
	}

}
