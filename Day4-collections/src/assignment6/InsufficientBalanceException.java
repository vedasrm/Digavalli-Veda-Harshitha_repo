package assignment6;



public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(){
		super("Insuffient Balance in the account");
}
}
