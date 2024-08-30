package assignment8;
import assignment8.*;

public class LoanTransaction implements Runnable {
	private BankFund bankFund;
	private int customerId;
	private double loanAmount;
	public LoanTransaction(BankFund bankFund,int customerId, double loanAmount){
		this.customerId=customerId;
		this.bankFund=bankFund;
		this.loanAmount=loanAmount;
		}


@Override
public void run() {
	try {
		bankFund.checkFund(loanAmount);
		Thread.sleep((long)(2000*Math.random()));
		double fundAvailable=bankFund.debitFund(loanAmount);
		System.out.println(customerId+"The loan is disbursed."+"Please collect the cash from the Teller");
		System.out.println("Fund left in the bank: "+fundAvailable);
		} catch (InsufficientFundException e) {
			System.out.println("Sorry!!!"+customerId+" Please "+"try some days later as we are short of funds");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("The thread was interrupted");
	}
}

}
