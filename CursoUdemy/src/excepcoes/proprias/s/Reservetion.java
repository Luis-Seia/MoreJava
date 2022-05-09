package excepcoes.proprias.s;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservetion {
	private Integer numQuarto;
	private Date entrada;
	private Date saida;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// construtor
	public Reservetion(Integer numQuarto, Date entrada, Date saida)  {
		if(!saida.after(entrada)) {
			 throw new DomainException("Error in reservation: Check-out data must be after check-in data");
		 }
		this.numQuarto = numQuarto;
		this.entrada = entrada;
		this.saida = saida;
	}
	
	//  getters e setters
	public Integer getNumQuarto() {
		return numQuarto;
	}
	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}
	public Date getEntrada() {
		return entrada;
	}
	
	public Date getSaida() {
		return saida;
	}
	
	public long duracao() {
	 long diff = saida.getTime() - entrada.getTime();  // diferenca e milissegundos
	return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // CONVERTE DE milisegundos para dias
	}
	
	
	public void updateDate(Date checkin, Date checkout){
		 Date now = new Date();
		 if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Erro: in reservation: reservaion dates for updates be future dates");
		 }
		 if(!checkout.after(checkin)) {
			 throw new DomainException("Error in reservation: Check-out data must be after check-in data");
		 }
		this.entrada=checkin;
		this.saida=checkout;
	}
	
	@Override
	public String toString() {
		return "Numero do quarto: " 
				+ numQuarto +", Data de entrada: "
				+ sdf.format(entrada)+ ", Data de saida: "+
				sdf.format(entrada)+ ", "
				+ duracao()+ "noites";
	}
}
