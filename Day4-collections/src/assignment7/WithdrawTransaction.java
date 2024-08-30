package assignment7;


import assignment7.*;
import com.seed.customer.*;



public class WithdrawTransaction extends Security implements Runnable{

private int transactionId;

private Account account;

private Customer customer;

private double amount;


public WithdrawTransaction(int transactionId,Account account,Customer customer,double amount){
this.transactionId=transactionId;
this.account=account;
this.customer=customer;
this.amount=amount;
}

public  double  withdraw(Account account,double amount) throws InsufficientBalanceException{
	if(account.getBalance()>=amount) {
		account.setBalance(account.getBalance()-amount);
		
}else{

throw new InsufficientBalanceException();
}
	return account.getBalance();

}


public void run() {
try{
	
	try {
		authorization(account,customer);
	} catch (assignment6.UnAuthorizedWithdrawTransactionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	double balance=withdraw(account, amount);
	System.out.println(transactionId+" transaction"+ "completed!!! and the balance amount is "+balance);
	}catch(InsufficientBalanceException insufficientBalanceException){
			System.out.println(transactionId+" transaction "+   "failed!!! and your account has insufficient" + "balance");
}
}
}
