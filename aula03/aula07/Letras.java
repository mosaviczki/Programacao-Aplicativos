package aula07;

import java.util.InputMismatchException;

public class Letras {
	private String a, b;

	public Letras(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public boolean comparar() throws Exception {
		return this.a.equals(this.b);
	}
	
	public int contarString(String letra) throws Exception{
		return letra.length();
	}
	
	public String converterMinuscula(String letra) throws InputMismatchException, Exception {
		return letra.toLowerCase();
	}
	
	public String converterMaiuscula(String letra) throws InputMismatchException,Exception {
		return letra.toUpperCase();
	}
	
}
