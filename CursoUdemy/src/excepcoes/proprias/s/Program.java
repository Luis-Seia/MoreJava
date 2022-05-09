package excepcoes.proprias.s;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Program {
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
			
			reservetion.updateDate(checkin, checkout);
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error reservation " +e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
}
}