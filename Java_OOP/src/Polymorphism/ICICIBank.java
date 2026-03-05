package Polymorphism;

public class ICICIBank extends Bank {
	
	public String getName() {
		return "ICICIBank";
	}
	
	@Override
	public double interestRate() {
		return 9.75;
	}


}
