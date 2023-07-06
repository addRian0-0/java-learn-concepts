package com.learn.modelo;

public class AccountCurrent extends Account{

	public AccountCurrent(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public boolean withdraw(double value) {
			double commission  = 0.2;
			return super.withdraw(value  + commission) ;
	}
	
	@Override
	public void deposit(double value) {}
	
}
