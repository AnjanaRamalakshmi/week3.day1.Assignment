package week3.day1as;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Deposit method in AxisBank class");
	}

	public static void main(String[] args) 
	{
		AxisBank axisBank = new AxisBank();
		BankInfo bankInfo = new BankInfo();
		axisBank.saving();
		axisBank.fixed();
		axisBank.deposit();
		bankInfo.deposit();

	}

}
