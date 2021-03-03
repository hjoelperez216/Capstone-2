package com.techelevator.tenmo.models;

public class Transfers {
	
	private Long transfer_id;
	private int transfer_type_id;
	private int transfer_status_id;
	private int account_from;
	private int account_to;
	private double amount;
	
	public Transfers(Long transfer_id, int transfer_type_id, int transfer_status_id, int account_from, int account_to, double amount) {
		this.transfer_id        = transfer_id;
		this.transfer_type_id   = transfer_type_id;
		this.transfer_status_id = transfer_status_id;
		this.account_from       = account_from;
		this.account_to         = account_to;
		this.amount             = amount;	
	}
	
	
	/**
	 * @return the transfer_id
	 */
	public Long getTransfer_id() {
		return transfer_id;
	}
	/**
	 * @param transfer_id the transfer_id to set
	 */
	public void setTransfer_id(Long transfer_id) {
		this.transfer_id = transfer_id;
	}
	/**
	 * @return the transfer_type_id
	 */
	public int getTransfer_type_id() {
		return transfer_type_id;
	}
	/**
	 * @param transfer_type_id the transfer_type_id to set
	 */
	public void setTransfer_type_id(int transfer_type_id) {
		this.transfer_type_id = transfer_type_id;
	}
	/**
	 * @return the transfer_status_id
	 */
	public int getTransfer_status_id() {
		return transfer_status_id;
	}
	/**
	 * @param transfer_status_id the transfer_status_id to set
	 */
	public void setTransfer_status_id(int transfer_status_id) {
		this.transfer_status_id = transfer_status_id;
	}
	/**
	 * @return the account_from
	 */
	public int getAccount_from() {
		return account_from;
	}
	/**
	 * @param account_from the account_from to set
	 */
	public void setAccount_from(int account_from) {
		this.account_from = account_from;
	}
	/**
	 * @return the account_to
	 */
	public int getAccount_to() {
		return account_to;
	}
	/**
	 * @param account_to the account_to to set
	 */
	public void setAccount_to(int account_to) {
		this.account_to = account_to;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "transfers [transfer_id=" + transfer_id + ", transfer_type_id=" + transfer_type_id
				+ ", transfer_status_id=" + transfer_status_id + ", account_from=" + account_from + ", account_to="
				+ account_to + ", amount=" + amount + "]";
	}

	
}
