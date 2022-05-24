package generics.program1.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import generics.program1.entitieis.Product;
import generics.program1.services.CalculetionService;
import interfaces.entities.employee.Employee;

public class aplication {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		String path = "D:\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String productCsv = br.readLine(); // ler os arquivos no ficheiro
			while(productCsv!=null) {
				String [] fields = productCsv.split(",");
				list.add(new  Product(fields[0], Double.parseDouble(fields[1])));
				productCsv = br.readLine();
			}
			Product x = CalculetionService.max(list);
		
		}catch(IOException e) {
			System.out.println("Error: " +e.getMessage());
		}

	}

	

}
