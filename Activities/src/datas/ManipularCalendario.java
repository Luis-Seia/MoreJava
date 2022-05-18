package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
 ;

public class ManipularCalendario {
	public static void main (String[] args) throws ParseException {
		SimpleDateFormat date3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data4 =  Date.from(Instant.parse("2022-05-21T15:42:07Z"));
		
		System.out.println(date3.format(data4));
		
		Calendar cal =  Calendar.getInstance();
		cal.add(Calendar.HOUR_OF_DAY, 4); // Acrescenta horas a data 
		
		int minutes = cal.get(Calendar.MINUTE); // retorna o minuto actual
		int muth = cal.get(Calendar.MONTH); 
		
		System.out.println(minutes);
		System.out.println(muth);
	}
		
		

}
