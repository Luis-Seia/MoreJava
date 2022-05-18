package Biulder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class testes {
public static void main(String[] args) throws ParseException {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Comment c1 = new Comment("Have a nice trip");
	Comment c2 = new Comment("Crazy");
	Post p1 = new Post(sdf.parse("21/05/2022 12:20:22"), "Traveling", "GOOD BAY", 12);
	
	p1.addComents(c2);
	p1.addComents(c1);
	
	System.out.println(p1);
}
}
