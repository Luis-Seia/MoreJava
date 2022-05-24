package generics.wicard.program;


import java.util.Arrays;
import java.util.List;

public class program2 {
	public static void main(String args[]) {
	 /*Com tipos corringas podemos fazer metodos que recebem genericos de qualquer tipo
	  * Exemplo; */
		
		List<Integer> inter = Arrays.asList(5, 3, 10);
		printList(inter);
	}
	
	public static void printList(List<?> list) {
		for (Object obj: list) {
			System.out.println(obj);
		}
	}
}
