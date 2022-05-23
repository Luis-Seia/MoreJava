package defaullt.methods.interfaces;

import java.security.InvalidParameterException;

public interface IInterestService {
	double getInterestRate();
	
	
	default double payment(double amount, int months) {
		if (amount <1) {
			
			throw new InvalidParameterException("Months must be greater than zero");
		}
		
	return amount * Math.pow(1.0 + getInterestRate()/ 100.00, months);
}
}
