package com.tnsif.daythirteen.synchronization;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException()
	{
		super("insufficient balance in your account .");
	}
	
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}
