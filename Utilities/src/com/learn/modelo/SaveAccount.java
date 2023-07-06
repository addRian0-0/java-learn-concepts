package com.learn.modelo;

public class SaveAccount {

	/**
	 * create object for save many accounts
	 * allow add account with a method
	 * */
	
	Object[] reference = new Object[10];
	int index = 0;

	public void add(Account acc) {
		reference[index] = acc;
		index++;
	}
	
	public Object get(int index) {
		return reference[index];
	}
	
}
