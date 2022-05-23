package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		lista.add("Lius");
		lista.add("Lius");
		lista.add("Marcos");
		lista.add("Lius");
		lista.add(2,"Lis");
		
		
		for (String list: lista) {
			System.out.println(list);
		}
		lista.removeIf(x -> x.charAt(0)== 'M'); // remove o elemento que comeca com o caracter indicado
		
		lista.indexOf("luis"); // retorne a posicao da string na lista
		
		List<String> result = lista .stream().filter(x -> x.charAt(0)== 'A').collect(Collectors.toList());// filtra os lementos qu comecam com o caracter indicado
		String name = lista.stream().filter(x -> x.charAt(0)== 'A').findFirst().orElse(null); // retorna a primeira String com o caracter imdicado
		
		
			
	}
}
