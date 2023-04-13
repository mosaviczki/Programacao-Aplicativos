package aula06;

public class ClinicaTeste {
	public static void main(String[] args) {
		Clinica clinica = new Clinica("086948-78", "CliniPet");
		clinica.cadastrar();
		clinica.cadastrar();
		clinica.listarAnimais();
	}
}
