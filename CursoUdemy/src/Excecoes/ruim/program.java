package Excecoes.ruim;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class program {

	public static void main(String[] args) throws ParseException{
	Scanner scan = new Scanner(System.in);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("Enter number");
	int number = scan.nextInt();
	System.out.println("Enter Check-in date (dd/MM/yyyy)");
	Date checkin = sdf.parse(scan.next());
	System.out.println("Enter Check-out date (dd/MM/yyyy)");
	Date checkout = sdf.parse(scan.next());
	
	if(!checkout.after(checkin)) { //verifica se a data e posterior
		System.out.println("Error in reservation: Check-out data must be after check-in data");
	}else {
		Reservetion reservetion = new Reservetion(number, checkin, checkout);
		System.out.println("Reservetion: + " +reservetion);
	}
	
	
	
	
	}

}
