package com.techelevator.tenmo.model;

public class Transfers {

	private Long transferId;
	private int transferTypeId;
	private int transferStatusId;
	private Long accountFrom;
	private Long accountTo;
	private double amount;
	private String transferType;
	private String transferStatus;
	
	
	public Transfers() {
		this.transferId        = transferId;
		this.transferTypeId    = transferTypeId;
		this.transferStatusId  = transferStatusId;
		this.accountFrom       = accountFrom;
		this.accountTo         = accountTo;
		this.amount            = amount;	
	}


	public Long getTransferId() {
		return transferId;
	}


	public void setTransferId(Long transferId) {
		this.transferId = transferId;
	}


	public int getTransferTypeId() {
		return transferTypeId;
	}


	public void setTransferTypeId(int transferTypeId) {
		this.transferTypeId = transferTypeId;
	}


	public int getTransferStatusId() {
		return transferStatusId;
	}


	public void setTransferStatusId(int transferStatusId) {
		this.transferStatusId = transferStatusId;
	}


	public Long getAccountFrom() {
		return accountFrom;
	}


	public void setAccountFrom(Long accountFrom) {
		this.accountFrom = accountFrom;
	}


	public Long getAccountTo() {
		return accountTo;
	}


	public void setAccountTo(Long accountTo) {
		this.accountTo = accountTo;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getTransferType() {
		return transferType;
	}


	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}


	public String getTransferStatus() {
		return transferStatus;
	}


	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}


	@Override
	public String toString() {
		return "Transfers [transferId=" + transferId + ", transferTypeId=" + transferTypeId + ", transferStatusId="
				+ transferStatusId + ", accountFrom=" + accountFrom + ", accountTo=" + accountTo + ", amount=" + amount
				+ ", transferType=" + transferType + ", transferStatus=" + transferStatus + "]";
	}

	/**
	 * @return the transferId
	 */



	
	
	
}
