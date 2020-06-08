package BankApp;

public class Savings extends Account{
	
	private int safetyDepositBoxID, safetyDepositBoxKey;
	
	public Savings(String name, String ssNum, double intDeposit) {
		super(name, ssNum, intDeposit);
		acntNum = "1" + acntNum;
		setSafetyDepositBox();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		
	}
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() { 
		super.showInfo();
	
		System.out.println("Your savings account features " + "\n Safety Deposit ID: " + safetyDepositBoxID
				+ "\n Safety Deposit Key: " + safetyDepositBoxKey);
	}

}