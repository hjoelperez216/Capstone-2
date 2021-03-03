package com.techelevator.tenmo.model;

public class Transfers {

	private Long transferId;
	private int transferTypeId;
	private int transferStatusId;
	private int accountFrom;
	private int accountTo;
	private double amount;
	
	public Transfers(Long transfer_id, int transfer_type_id, int transfer_status_id, int account_from, int account_to, double amount) {
		this.transferId        = transfer_id;
		this.transferTypeId   = transfer_type_id;
		this.transferStatusId = transfer_status_id;
		this.accountFrom       = account_from;
		this.accountTo         = account_to;
		this.amount             = amount;	
	}

	public Long getTransfer_id() {
		return transferId;
	}

	public void setTransfer_id(Long transfer_id) {
		this.transferId = transfer_id;
	}

	public int getTransfer_type_id() {
		return transferTypeId;
	}

	public void setTransfer_type_id(int transfer_type_id) {
		this.transferTypeId = transfer_type_id;
	}

	public int getTransfer_status_id() {
		return transferStatusId;
	}

	public void setTransfer_status_id(int transfer_status_id) {
		this.transferStatusId = transfer_status_id;
	}

	public int getAccount_from() {
		return accountFrom;
	}

	public void setAccount_from(int account_from) {
		this.accountFrom = account_from;
	}

	public int getAccount_to() {
		return accountTo;
	}

	public void setAccount_to(int account_to) {
		this.accountTo = account_to;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "transfers [transfer_id=" + transferId + ", transfer_type_id=" + transferTypeId
				+ ", transfer_status_id=" + transferStatusId + ", account_from=" + accountFrom + ", account_to="
				+ accountTo + ", amount=" + amount + "]";
	}
	
	
	
}
