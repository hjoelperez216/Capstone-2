package com.techelevator.tenmo.models;

public class Accounts {

	private Long account_id;
	private int user_id;
	private double balance;
	
	public Accounts() {
		this.account_id = account_id;
		this.user_id = user_id;
		this.balance = balance;
	}
	
	/**
	 * @return the account_id
	 */
	public Long getAccount_id() {
		return account_id;
	}
	/**
	 * @param account_id the account_id to set
	 */
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "accounts [account_id=" + account_id + ", user_id=" + user_id + ", balance=" + balance + "]";
	}
	
	
	
}
