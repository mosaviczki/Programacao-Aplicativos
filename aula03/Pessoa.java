package aula03;

public class Pessoa {

	private String nome, dataNascimento, sexo, email;
	private Endereco endereco;
	private EstadoCivil estadoCivil;

	public Pessoa(String nome, String dataNascimento, String sexo, String email, String logradouro, int numero,
			String bairro, String cidade, String unidadeFederativa, EstadoCivil estadoCivil) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public String getEmail() {
		return email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "--------------------------\n" + "Nome: " + this.nome + "\n" + "Data de nascimento: "
				+ this.dataNascimento + "\n" + "Sexo: " + this.sexo + "\n" + "Email: " + this.email + "\n"
				+ "Endereço: " + this.endereco.getLogradouro() + " " + this.endereco.getNumero() + ", "
				+ this.endereco.getBairro() + ", " + this.endereco.getCidade() + " - "
				+ this.endereco.getUnidadeFederativa() + "\n" + "Estado Civil: " + this.estadoCivil + "\n";
	}

}
