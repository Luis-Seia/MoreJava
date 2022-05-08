package JavaBasico;

import java.util.Locale;

public class Saida {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // separa as casas decimais co ponto
		double y = 23.35345;
		System.out.println();// imprime com quebra de linha
		
		System.out.print(""); // sem quebra de linha
		
		System.out.printf("%.2f%n",y); // controlar as casas decimais
		
		
	}
}
