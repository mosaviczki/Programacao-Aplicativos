package aula05;

public class Endereco {
	private String logradouro, bairro, cidade, unidadeFederativa;
	private int numero;
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}

	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public int getNumero() {
		return numero;
	}

}
