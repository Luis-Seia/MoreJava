package defaullt.methods.interfaces;

public class UsaInterestService implements IInterestService{
	private double interestRate;

	public UsaInterestService(double interestRate) {

		this.interestRate = interestRate;
	}

	
	public double getInterestRate() {
		return interestRate;
	}

	
}
