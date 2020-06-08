package BankApp;

public class Checking extends Account{
	private int debitCardNum, debitCardPin;

	public Checking(String name, String ssNum, double intDeposit ) {
		super(name, ssNum, intDeposit);
		acntNum = "2" + acntNum;
		setDebitCard();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		debitCardNum = (int)(Math.random()* Math.pow(10, 12));
		debitCardPin = (int)(Math.random()* Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features \n Debit Card Number: " + debitCardNum + 
				"\n Debit Card PIN: " + debitCardPin);
		
	}

}