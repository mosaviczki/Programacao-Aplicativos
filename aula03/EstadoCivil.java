package aula03;

public enum EstadoCivil {
	SOLTEIRO(0, "Solteiro"),
	CASADO(1, "Casado"),
	DIVORCIADO(2, "Divorciado"),
	VIUVO(3, "Viuvo");
	
	private int numero;
	private String estado;
	
	private EstadoCivil(int numero, String estado) {
		this.numero = numero;
		this.estado = estado;
	}

	public int getNumero() {
		return numero;
	}

	public String getEstado() {
		return estado;
	}

	
	
}
