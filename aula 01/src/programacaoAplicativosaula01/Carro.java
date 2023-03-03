package programacaoAplicativosaula01;

public class Carro {
	String modelo, marca, placa, cor;
	int ano, velocidade;
	boolean ligar; 

	public Carro(String modelo, String marca, String placa, String cor, int ano) {
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
		this.ligar = false;
		this.velocidade = 0;
	}

	public void ligar() {
		if (this.ligar == false) {
			System.out.println("Ligando o carro!");
			this.ligar = true;
		}else {
			System.out.println("O carro já esta ligado!");
		}
	}

	public void desligar() {
		if (this.ligar == true) {
			System.out.println("Desligando o carro!");
			this.ligar = false;
			this.velocidade = 0;
		}else {
			System.out.println("O carro já esta desligado!");
		}
	}

	public void acelerar() {
		if (ligar == true) {
			this.velocidade = this.velocidade + 20;
			System.out.println("Vruuuuuummmmmm, acelerando! Velocidade: " + this.velocidade + "km/h");
		}else {
			System.out.println("O carro precisa estar ligado para acelerar.");
		}
		
	}

	public void frear() {
		if (ligar == true && this.velocidade > 0) {
			this.velocidade = this.velocidade - 20;
			System.out.println("Freando o carro! Velocidade: " + this.velocidade + "km/h");
		}else if(ligar == false || this.velocidade == 0){
			System.out.println("O carro precisa estar ligado ou com velocidade superior a 0km/h ");
		}
		
	}

	@Override
	public String toString() {
		return "--------- Carro ---------" + "\n" + "modelo: " + modelo + "\n" + "marca: " + marca + "\n" + "placa: " + placa + "\n"
				+ "cor: " + cor + "\n" + "ano: " + ano + "\n";
	}
}
