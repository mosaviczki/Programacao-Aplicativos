package programacaoAplicativosaula01;

public class CarroTeste {
	public static void main(String[] args) {
		Carro carro1 = new Carro("458 Italia", "Ferrari", "AAA-1234", "Vermelho", 2015);
		Carro carro2 = new Carro("Civic", "Honda", "MNO-9876", "Azul", 2019);
		Carro carro3 = new Carro("911 Carrera", "Porsche", "XYZ-5555", "Branco", 2018);
		
		System.out.print(carro1);
		carro1.ligar();
		carro1.ligar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.frear();
		carro1.desligar();
		carro1.acelerar();
		
		
	}

}
