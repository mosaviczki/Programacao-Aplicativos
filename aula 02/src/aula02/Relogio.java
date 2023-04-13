package aula02;

public class Relogio {
	private String marca;
	private int hora, min;

	public Relogio(String marca, int hora, int min) {
		this.marca = marca;
		this.hora = hora;
		this.min = min;
	}

	public String getMarca() {
		return marca;
	}

	public int getHora() {
		return hora;
	}

	public int getMin() {
		return min;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			System.out.println("O horario deve ser entre 0 a 23");
		}
	}

	public void setMin(int min) {
		if (min >= 0 && min <= 59) {
			this.min = min;
		} else {
			System.out.println("Os minutos deve ser entre 0 a 59");
		}
	}

	@Override
	public String toString() {
		return "Relogio " + this.marca + "\n" + this.hora + ":" + this.min;
	}

}
