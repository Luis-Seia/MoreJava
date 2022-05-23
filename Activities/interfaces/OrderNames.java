import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderNames {
public static void main(String args[]) {
	List<String> list = new ArrayList<>();
	String path = "D:\\in.txt";
	
	try (BufferedReader br = new BufferedReader(new FileReader(path))){
		String name = br.readLine(); // ler os arquivos no ficheiro
		while(name!=null) {
			list.add(name);
			nome = br.readLine();
		}
		Collectors.sort(list); // odernar por nomr
		for(String order: list) {
			System.out.println(order);
		}
	}catch(IOException e) {
		System.out.println("Error: " +e.getMessage()e);
	}
	
}
}
