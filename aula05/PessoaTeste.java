package aula05;

public class PessoaTeste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("BCC", "Igor lazarento", 23, "Rua da Eskimo", 111, "Jardim Carvalho", "Ponta Grossa",
				"PR");
		Professor prof = new Professor("Sheilinha do computer", 38, "Rua Dep. Chafic Cury", 222, "Jardim Carvalho",
				"Ponta Grossa", "PR");
		prof.calcularSalario(9850.00);
		System.out.println(prof);
		System.out.println(aluno);

	}
}
