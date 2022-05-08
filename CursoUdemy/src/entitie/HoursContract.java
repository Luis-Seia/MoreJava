package entitie;

import java.util.Date;

public class HoursContract {	
	private Date date;
	private Double valueHour;
	private Integer hour;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getValueHour() {
		return valueHour;
	}
	public void setValueHour(Double valueHour) {
		this.valueHour = valueHour;
	}
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public HoursContract(Date date, Double valueHour, Integer hour) {
		super();
		this.date = date;
		this.valueHour = valueHour;
		this.hour = hour;
	}
	public HoursContract() {
		super();
	}
	public double totalValue() {
		return valueHour * hour;
	}
}
