package main;

import com.learn.modelo.SaveAccount;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.learn.modelo.Account;
import com.learn.modelo.AccountCurrent;

/**
 * 
 * @author catdrian
 * ArrayList, Vector, LinkedList 
 * usages
 *
 */

public class Main {

	public static void main(String [] args) {
		
		/*
		 * SaveAccount saveAcc = new SaveAccount(); Account acc = new AccountCurrent(11,
		 * 22); saveAcc.add(acc);
		 * 
		 * Account acc2 = new AccountCurrent(22, 44); saveAcc.add(acc);
		 * 
		 * System.out.println(saveAcc.get(0)); System.out.println(saveAcc.get(1));
		 */
		
		/**
		 * ArrayList
		 * */
		
		// ArrayList generics           
		List<Account> arr = new ArrayList<>();
		
		// LinkedList
		// List<Account> arr = new LinkedList<>();
		
		Account acc3 = new AccountCurrent(55, 43);
		Account acc4 = new AccountCurrent(13, 18);
		
		arr.add(acc3);
		arr.add(acc4);
		
		Account getAccount = (Account) arr.get(0);
		System.out.println(getAccount);
		
		// forEach
		for(Account accEx  :  arr ) {
			System.out.println(accEx);
		}
		
		// if arr. contains reference an object -> true, not compare attributes of object
		// System.out.println(arr.contains(acc4));

		/**
		 * Wrappers 
		 * */
		
	}
}
