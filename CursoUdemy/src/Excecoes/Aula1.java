package Excecoes;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] vet = scan.nextLine().split(" ");
		int pos = scan.nextInt();
		System.out.println(vet[pos]);

	}

}
