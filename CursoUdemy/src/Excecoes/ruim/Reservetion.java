package Excecoes.ruim;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservetion {
private Integer numQuarto;
	private Date entrada;
	private Date saida;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Reservetion(Integer numQuarto, Date entrada, Date saida) {
		this.numQuarto = numQuarto;
		this.entrada = entrada;
		this.saida = saida;
	}
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
	public void atualizarData(Date entrada, Date saida) {
		this.entrada=entrada;
		this.saida=saida;
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