package com.learn.modelo;

public abstract class Account {

	protected double balance; 
	private int agency = 1;
	private int number;
	
	private static int total;
	
	public Account() {}
	
	public Account(int agency, int number) {
		this.agency = agency;
		this.number = number;
		
		System.out.println("Account create with number: " + this.number);
		Account.total++;
	}
	
	public abstract void deposit(double value);
	
	public boolean withdraw(double value) {
		if(this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
	}
	
	public boolean transfer(double value, Account destination) {
		
		if(this.balance >= value) {
			this.withdraw(value);
			destination.deposit(value);
			return true;
		}else {
			return false;
		}
		
	}

	public double getBalance() {
		return balance;
	}

	public int getAgency() {
		return agency;
	}

	public void setAgency(int agency) {
		if (agency > 0) {
            this.agency = agency;
        }
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number > 0) {
            this.number = number;
        }
	}

	public static int getTotal() {
		return Account.total;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account acc  = (Account) obj;
		return this.agency == acc.getAgency() && this.number == acc.getNumber();
	}
	
}
