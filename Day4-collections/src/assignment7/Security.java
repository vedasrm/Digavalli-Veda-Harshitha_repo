package assignment7;

import assignment6.Account;
import com.seed.customer.Customer;
import assignment6.UnAuthorizedWithdrawTransactionException;


public class Security {
	public void authorization(assignment7.Account account,Customer customer) throws UnAuthorizedWithdrawTransactionException{
		if(account.getCustomer().getCustomerId()!= customer.getCustomerId()){
			throw new UnAuthorizedWithdrawTransactionException();
}
}
}
