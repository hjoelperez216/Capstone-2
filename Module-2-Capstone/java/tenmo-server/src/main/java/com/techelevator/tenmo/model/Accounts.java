package com.techelevator.tenmo.model;

public class Accounts {

	private Long accountId;
	private int userId;
	private double balance;
	
	public Accounts() {
		this.accountId = accountId;
		this.userId = userId;
		this.balance = balance;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long account_id) {
		this.accountId = account_id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int user_id) {
		this.userId = user_id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Accounts [accountId=" + accountId + ", userId=" + userId + ", balance=" + balance + "]";
	}


	
	
	
}
