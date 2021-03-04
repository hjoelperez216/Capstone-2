package com.techelevator.tenmo.model;

public class Transfers {

	private Long transferId;
	private int transferTypeId;
	private int transferStatusId;
	private int accountFrom;
	private int accountTo;
	private double amount;
	private String transferType;
	private String transferStatus;
	
	
	
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

	public Transfers() {
		this.transferId        = transferId;
		this.transferTypeId    = transferTypeId;
		this.transferStatusId  = transferStatusId;
		this.accountFrom       = accountFrom;
		this.accountTo         = accountTo;
		this.amount            = amount;	
	}

	/**
	 * @return the transferId
	 */
	public Long getTransferId() {
		return transferId;
	}

	/**
	 * @param transferId the transferId to set
	 */
	public void setTransferId(Long transferId) {
		this.transferId = transferId;
	}

	/**
	 * @return the transferTypeId
	 */
	public int getTransferTypeId() {
		return transferTypeId;
	}

	/**
	 * @param transferTypeId the transferTypeId to set
	 */
	public void setTransferTypeId(int transferTypeId) {
		this.transferTypeId = transferTypeId;
	}

	/**
	 * @return the transferStatusId
	 */
	public int getTransferStatusId() {
		return transferStatusId;
	}

	/**
	 * @param transferStatusId the transferStatusId to set
	 */
	public void setTransferStatusId(int transferStatusId) {
		this.transferStatusId = transferStatusId;
	}

	/**
	 * @return the accountFrom
	 */
	public int getAccountFrom() {
		return accountFrom;
	}

	/**
	 * @param accountFrom the accountFrom to set
	 */
	public void setAccountFrom(int accountFrom) {
		this.accountFrom = accountFrom;
	}

	/**
	 * @return the accountTo
	 */
	public int getAccountTo() {
		return accountTo;
	}

	/**
	 * @param accountTo the accountTo to set
	 */
	public void setAccountTo(int accountTo) {
		this.accountTo = accountTo;
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
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transfers [transferId=" + transferId + ", transferTypeId=" + transferTypeId + ", transferStatusId="
				+ transferStatusId + ", accountFrom=" + accountFrom + ", accountTo=" + accountTo + ", amount=" + amount
				+ ", transferType=" + transferType + ", transferStatus=" + transferStatus + "]";
	}



	
	
	
}
