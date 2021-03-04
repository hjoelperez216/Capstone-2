package com.techelevator.tenmo.model;

public class TransferTypes {
	
	private Long transferTypes;
	private String transferTypeDesc;
	
	public TransferTypes() {
		this.transferTypes = transferTypes;
		this.transferTypeDesc = transferTypeDesc;
	}

	public Long getTransferTypes() {
		return transferTypes;
	}

	public void setTransferTypes(Long transferTypes) {
		this.transferTypes = transferTypes;
	}

	public String getTransferTypeDesc() {
		return transferTypeDesc;
	}

	public void setTransferTypeDesc(String transferTypeDesc) {
		this.transferTypeDesc = transferTypeDesc;
	}

	@Override
	public String toString() {
		return "TransferTypes [transferTypes=" + transferTypes + ", transferTypeDesc=" + transferTypeDesc + "]";
	}

	

}
