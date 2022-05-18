package entitie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.enums.WorkerLevel;

public class TesteWorker {
	public static void main (String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		  Worker worker = new Worker("Luis", WorkerLevel.valueOf("JUNIOR"), 1800.0,new Departament("Vendas"));
		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  System.out.println("How many contracts to this worker?");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter contract "+i+" data:");
			System.out.print("DD/MM/YYYY: ");
			Date contractDate = sdf.parse(scan.next());
		
			System.out.print("Value per hour: ");
			double vauleHour = scan.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = scan.nextInt();
			HoursContract contract = new HoursContract(contractDate,vauleHour,hours);
			worker.addContract(contract);
			
		}
		System.out.println("\n Enter month and year to calculete income (MM/YYYY");
		String monthandYear = scan.next();
		int month = Integer.parseInt(monthandYear.substring(0,2));
		int year = Integer.parseInt(monthandYear.substring(3));
		System.out.println("Name: " +worker.getName());
		System.out.println("Departament: " +worker.getDepartamnet().getNome());
		System.out.println("Income for " +monthandYear+ ": "+String.format("%.2f", worker.income(year, month)));
	}
 
   
  
}
