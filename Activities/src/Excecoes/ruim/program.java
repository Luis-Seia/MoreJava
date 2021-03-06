package Excecoes.ruim;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	try {
		System.out.println("Enter number");
		int number = scan.nextInt();
		System.out.println("Enter Check-in date (dd/MM/yyyy)");
		Date checkin = sdf.parse(scan.next());
		System.out.println("Enter Check-out date (dd/MM/yyyy)");
		Date checkout = sdf.parse(scan.next());

		Reservetion reservetion = new Reservetion(number, checkin, checkout);
		System.out.println("Reservetion: + " +reservetion);
		
		System.out.println();
		System.out.println("Enter date to update the reservation");
		System.out.println("Enter Check-in date (dd/MM/yyyy)");
		 checkin = sdf.parse(scan.next());
		System.out.println("Enter Check-out date (dd/MM/yyyy)");
		checkin = sdf.parse(scan.next());
		System.out.println("Reservation: " +reservetion);
	}
	catch(ParseException e) {
		System.out.println("Invalid date format");
	}
	catch (IllegalArgumentException e) {
		System.out.println("Error reservation " +e.getMessage());
	}
	}
	
	
	

}
