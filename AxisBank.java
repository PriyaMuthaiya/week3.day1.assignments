package week3.day1.assignments;

public class AxisBank extends BankInfo{

	
	public void deposit() {
		System.out.println("Deposit in Axis Bank");  //this will call while execute instead parent class's method
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank axis=new AxisBank();
		axis.savings();
		axis.deposit();
		axis.fixed();
		
	}

}
