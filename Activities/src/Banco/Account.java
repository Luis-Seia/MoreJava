package Banco;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		
	}
	public Account() {
		this.withDrawLimit = this.balance-20;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	
	public void withDraw(double amount) {
		if(amount > balance || amount > withDrawLimit) {
			
		}
	}
	
	
}
