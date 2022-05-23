package interfaces.entities.employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderSalary {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "D:\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String employeeCsv = br.readLine(); // ler os arquivos no ficheiro
			while(employeeCsv!=null) {
				String [] fields = employeeCsv.split(",");
				list.add(new  Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list); // odernar por nomr
			for(Employee emp: list) {
				System.out.println(emp.getName() + ","+ emp.getSalary());
			}
		}catch(IOException e) {
			System.out.println("Error: " +e.getMessage());
		}

	}

}
