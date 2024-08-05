package com.tnsif.daythirteen.synchronization;

public class AccountThread extends Thread{
	
	private Account acc;
	private int amt;
	
	//Para constructor 
	public AccountThread(Account acc, int amt) {
		super();
		this.acc = acc;
		this.amt = amt;
		start();
	}
	
	
	@Override
	public void run() {
		try {
			
			acc.withdraw(amt);
		}
		catch (InsufficientBalanceException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	

}
