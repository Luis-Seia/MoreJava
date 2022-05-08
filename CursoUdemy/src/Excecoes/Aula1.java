package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("Fim");
	

	}
	public  static void method1() {
		System.out.println("Inicio metodo 1");
		method2();
		System.out.println("Fim metodo 1");
	}
	
	public  static void method2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inicio metodo 2");
		try {
			String[] vet = scan.nextLine().split(" ");
			int pos = scan.nextInt();
			System.out.println(vet[pos]);
			
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posicao Invalida");
				e.printStackTrace();
			}
			catch(InputMismatchException e) {
				System.out.println("Input error");
			}
			scan.close();
			System.out.println("Fim metodo 2");
	}
	
}
