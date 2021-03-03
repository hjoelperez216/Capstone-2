package com.techelevator.tenmo.model;

public class Accounts {

	private Long account_id;
	private int user_id;
	private double balance;
	
	public Accounts(Long account_id, int user_id, double balance) {
		this.account_id = account_id;
		this.user_id = user_id;
		this.balance = balance;
	}

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "accounts [account_id=" + account_id + ", user_id=" + user_id + ", balance=" + balance + "]";
	}
	
	
	
}
