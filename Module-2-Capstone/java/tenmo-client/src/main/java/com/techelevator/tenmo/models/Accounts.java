package com.techelevator.tenmo.models;

public class Accounts {

	private Long accountId;
	private int userId;
	private double balance;
	
	public Accounts() {
		this.accountId = accountId;
		this.userId = userId;
		this.balance = balance;
	}

	/**
	 * @return the accountId
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Accounts [accountId=" + accountId + ", userId=" + userId + ", balance=" + balance + "]";
	}
}
	
	