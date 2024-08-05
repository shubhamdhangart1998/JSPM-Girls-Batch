package com.tnsif.daythirteen.synchronization;

public class DepositLimitException extends Exception {

	
	public DepositLimitException()
	{
		super("daily limit of deposit is exceeded....");
	}
	
	public DepositLimitException(String message)
	{
		super(message);
	}
}
